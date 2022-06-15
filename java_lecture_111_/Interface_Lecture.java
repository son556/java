package java_lecture_111_;
class CalculatorDummy implements Interface_cal{// interface class 는 클래스 내에 동일한
//    메소드를 오버라이딩해주지 않으면 오류가 발생한다.
    public void setOprands(int first, int second, int third){
    }
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
public class Interface_Lecture {
    public static void main(String[] args){
        Calculator c = new Calculator();
        c.setOprands(10,20,30);
        System.out.println(c.sum());
        System.out.println(c.avg());
        System.out.println(c.sum() + c.avg());
    }
}
