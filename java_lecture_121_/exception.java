package java_lecture_121_;

import java.io.IOException;

class Calculator{
    int left, right;
    // input -> 10, 0 들어온경우
    public void setOprnads(int left, int right){
//        if(right == 0){
//            throw new ArithmeticException("second input != 0");
//        } // 두번째 값이 0이 들어오면 발생
        this.left = left;
        this.right = right;
    }
    public void divide(){
        if (right == 0){
            throw new ArithmeticException("error : number/0");// 실행시 함수 종료
        }// 나누는 상황에 0으로 나누면 발생
        try{
            System.out.println("calculate result");// 실행
            System.out.println(this.left/this.right);// 오류
        } catch (Exception e){
            // 아래로 갈수록 오류에 대한 상세한 정보를 보여준다.
            // / by zero
            System.out.println("\n\ne.getMessage()\n" + e.getMessage());// 실행
            // java.lang.ArithmeticException: / by zero
            System.out.println("\n\ne.toString()\n" + e.toString());
            //e.printStackTrace()
            //java.lang.ArithmeticException: / by zero
            //	at java_lecture_121_.Calculator.divide(exception.java:12)
            //	at java_lecture_121_.exception.main(exception.java:25)
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
        System.out.println("Divide End");
    }
}
class E{
    void throwArithmeticException(){
        throw new ArithmeticException();
        // RuntimeException의 자식, unchecked exception 예외처리 요구 안함
    }
    void throwIOException1(){
        try {
            throw new IOException();
            //Exception 의 자식, checked exception 반드시 throw 나 catch 로 예외처리 요구
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    void throwIOException2() throws IOException{
        throw new IOException();
    }
}
public class exception {
    public static void main(String[] args){
        Calculator c1 = new Calculator();
        c1.setOprnads(10,0);
        try{
            c1.divide();
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
