class Cal_Overloading {
    int left, right;
    int mid = 0;

//    public Calculator_1(){}



    public void setOprands(int left, int right) {
        System.out.println("setOprands(int left, int right, int mid)");
        this.left = left;
        this.right = right;
    }
    public void setOprands(int left, int right, int mid){
        System.out.println("setOprands(int left, int right, int mid)");
        this.setOprands(left, right);// 중복을 제거하기 위해
        this.mid = mid;
    }


    public void sum() {
        System.out.println(this.left + this.right + this.mid);
    }

}


public class overloading {
    void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A(int arg1)");}
    void A (String arg1){System.out.println("void A(String arg1)");}
    int A (int a, int b) {return 10;}
    public static void main(String[] args){
        Cal_Overloading c1 = new Cal_Overloading();
        c1.setOprands(10, 20);// 매소드 이름 변경없이 들어오는 인자로 구분해서 실행됨
        c1.sum();
        c1.setOprands(10,20,30);
        c1.sum();
        overloading od = new overloading();
        od.A();
        od.A(1);
        od.A("what");
        int c = od.A(1,2);
        System.out.println(c);
    }
}
