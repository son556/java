class Calculator_1 {
    int left, right;

//    public Calculator_1(){}

    public Calculator_1(int left, int right){
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
class SubstractionableCalculator_1 extends Calculator_1 {
    public SubstractionableCalculator_1(int left, int right) {
        super(left, right);// super: 부모 클래스 생성자에 left, right값을 넣어줌
        // 주의: 하위 클래스의 초기화 코드는 super 다음에 작성해야 한다.
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class inheritance_2 {

    public static void main(String[] args) {
        SubstractionableCalculator_1 c1 = new SubstractionableCalculator_1(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }

}
