package java_lecture_111_;
class O{
    public void a(int param){
        System.out.println("out digit");
        System.out.println(param);
    }
    public void a(String param){
        System.out.println("out string");
        System.out.println(param);
    }
    public String x(){
        return "A.x";
    }
}
class B extends O{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
class B_2 extends O{
    public String x(){return "B2.x";}
}
public class PolymorphismOverloadingDemo {
    public static void main(String[] args) {
        O o = new O();
        o.a(1);
        o.a("one");
        O obj = new B();
        System.out.println(obj.x());// 메소드 둘다 가지고 있을 때 class B의 메소드 실행
//        class O 안에는 메소드 y가 없어 오류 발생
//        obj.y();
        B oo = new B();
        System.out.println(oo.x());
        O ooo = new B_2();
        System.out.println(ooo.x());
    }
}
