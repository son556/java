class Cal{
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
}

class SubstractionableCalculator extends Cal {// Cal 에 substract 매소드를 추가해준다.
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

class MultiplicationableCalculator extends Cal {
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

public class inheritance {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        MultiplicationableCalculator c2 = new MultiplicationableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();// c1 [sum, avg, substract]
        System.out.println("----------------------------");
        c2.setOprands(10, 20);
        c2.sum();
        c2.avg();
//        c2.substract(); ->c2 [sum, avg, multiplication]
        c2.multiplication();

    }
}
