package java_lecture_111_;
interface I_2{
    public String A();
}
interface I_3{
    public String B();
}
class D implements I_2, I_3{
    @Override
    public String A() {
        return "A";
    }

    @Override
    public String B() {
        return "B";
    }
}
public class Interface_Polymophism {
    public static void main(String[] args){
        D obj = new D();
        I_2 objI2 = new D();
        I_3 objI3 = new D();

        obj.A();
        obj.B();

        objI2.A();
//       objI2.B(); error

//      objI3.A(); error
        objI3.B();
    }
}
