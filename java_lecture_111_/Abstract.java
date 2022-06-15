package java_lecture_111_;
abstract class Calculator_abs{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    int _sum() {
        return this.left + this.right;
    }
    public abstract void sum();
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator_abs{
    public void sum() {
        System.out.println("+ sum :" + _sum());
    }
    public void avg(){
        System.out.println("+ avg :"+ _sum()/2);
    }
}
class CalculatorDecoMinus extends Calculator_abs {
    public void sum(){
        System.out.println("- sum :"+_sum());
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
}
public class Abstract {
    public static void excute(Calculator_abs cal){
        System.out.println("result");
        cal.run();
    }
    public static void main(String[] args){
//        다형성을 이용하여 하나의 메소드 excute로 다른 결과를 낼 수 있다.
        Calculator_abs c1 = new CalculatorDecoPlus();
        Calculator_abs c2 = new CalculatorDecoMinus();
        c1.setOprands(10, 20);
        c2.setOprands(20,40);
        excute(c1);
        excute(c2);
    }
}
