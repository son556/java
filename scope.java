class C {
    int v = 10; // 전역변수

    void m() {
        int v = 20; // 지역변수
        System.out.println(v);// 지역변수 선언시 지역변수 출력 없으면 전역변수 출력
        System.out.println(this.v);// 전역변수 v 출력
    }
}

public class scope {
//    static int j = 0;
//    static int i = 0;//전역변수
//    static void a() {
//        int i = 0;// a 메소드 안에서만 유효 지역변수
//        j++;//전역변수
//    }
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {// for 문 안의 int i 는 지역변수 선언
//            a();
//            System.out.println(i);
////            System.out.println(j);
//        }
//    }
    //정적인 유효범위(static scope)
    static int i = 5;
    static void a() {
        int i = 10;// ->지역변수
        b();
    }
    static void b() {
//        int i = 12; //b 매소드안에 변수선언된 경우 전역변수가 아닌 b 의 지역변수 출력
        System.out.println(i);// -> 전역변수 출력
    }

    public static void main(String[] args) {
        C c1 = new C();
        int i = 1;
        a();
        c1.m();
    }
}
