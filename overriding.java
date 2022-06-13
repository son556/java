// overriding 조건
// 1. 매소드의 이름이 부모클래스와 자식클래스가 같아야한다.
// 2. 매소드 매개변수의 숫자와 데이터타입 그리고 순서가 부모클래스와 자식클래스가 같아야한다.
// 3. 매소드의 리턴타입이 부모클래스와 자식클래스가 같아야 한다.
class Overriding_Sample {
    int left, right;

//    public Calculator_1(){}

    public Overriding_Sample(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
class Overriding_Example extends Overriding_Sample {
    public Overriding_Example(int left, int right) {
        super(left, right);// super: 부모 클래스 생성자에 left, right값을 넣어줌
        // 주의: 하위 클래스의 초기화 코드는 super 다음에 작성해야 한다.
    }
    public void sum() {// 부모클래스에 overriding 됨
        System.out.println("result: " +(this.left + this.right));
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }

//    public int avg(){ //(error) overriding 할때는 부모 클래스의 매소드 반환 형태와 자식클래스 매소드의 형태가 서로 같아야 한다.
//        return (this.left + this.right)/2
//    }
}


public class overriding {
    public static void main(String[] args){
        Overriding_Example e1 = new Overriding_Example(10, 20);
        e1.sum();
    }
}
