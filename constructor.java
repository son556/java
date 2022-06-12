class Calculators {
    int left, right;

    // 생성자 -> setOprand 함수를 선언할 필요 없게 해준다
    public Calculators (int left, int right) {//클래스와 동일이름으로 선언
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

public class constructor {
    public static void main(String[] args) {

        Calculators c1 = new Calculators(1, 3);//생성자에 입력 값 넣기
        c1.sum();
        c1.avg();
    }
}
