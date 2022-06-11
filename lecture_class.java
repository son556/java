class Calculator{
    double left, right;//instance 변수
    static double PI = 3.14;//class 변수 static -> class 에 소속임을 명시
    static int base = 0;

    public void setOprand(double left, double right){
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right + base);
    }

    public static void cal_sum(int left, int right) {// static 이 붙은
        //////////////////////////////////// 함수는 클래스에서 직접 접근하여 실행 가능
        System.out.println(left + right);
    }

    public void avg() {
        System.out.println((this.left + this.right)/2);
    }
}

public class lecture_class {
    public static void main(String[] args){

        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        c1.setOprand(10, 20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        System.out.println(c2.PI);
        c2.setOprand(12, 17);
        c2.sum();
        Calculator.base = 10;// class 의 변수를 직접 변경
        c2.sum();
        c2.avg();

        Calculator.cal_sum(10, 20);
    }
}
