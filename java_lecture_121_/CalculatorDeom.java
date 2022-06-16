package java_lecture_121_;
class DivideException extends RuntimeException{
    DivideException(){// 기본생성자
        super();
    }
    DivideException(String message){
        super(message);
    }
}
class DivideException2 extends Exception{
    DivideException2(){// 기본생성자
        super();
    }
    DivideException2(String message){
        super(message);
    }
}
class Calculator_Demo{
    int left, right;
    // input -> 10, 0 들어온경우
    public void setOprnads(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide() {
//        if (right == 0) {
//            throw new DivideException("error : number/0");// 실행시 함수 종료
//        }// 나누는 상황에 0으로 나누면 발생
        if (right == 0) {
            try {
                throw new DivideException2("error : number/0!!");
            } catch (DivideException2 e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.left/this.right);
    }
}
public class CalculatorDeom {
    public static void main(String[] args){
        Calculator_Demo c1 = new Calculator_Demo();
        c1.setOprnads(10,0);
        c1.divide();
    }
}
