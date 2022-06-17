package java_lecture_133_;
class Calculator{// extends Object 가 생략되어있음
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left + this.right);
    }
    public void avg(){
        System.out.println((this.left + this.right)/2);
    }
    public String toString(){
        return super.toString()+", left :" + this.left+", right :"+ this.right;
    }
}
public class Lecture_Object {
    public static void main(String[] args){
        Calculator c1 = new Calculator();
        c1.setOprands(10,20);
        System.out.println(c1);
        System.out.println(c1.toString());// Calculator 가 Object 자식클래스여서 Object 클래스의 메소드인 .toString을 사용가능
    }
}
