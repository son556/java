class C1{
    static int static_variable = 1;
    int instance_variable = 2;

    static void static_static(){
        System.out.println(static_variable);
    }

    static void static_instance() {
//        클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다.
//        System.out.println(instance_variable);
    }

    void instance_static(){
//        인스턴스 메소드에서는 클래스 변수에 접근 가능능
        System.out.println(static_variable);
    }
    void instance_instance(){
        System.out.println(instance_variable);
    }
}

public class lecture_class_2 {
    public static void main(String[] args) {
        C1 c = new C1();
        c.static_static();

        c.instance_static();
        c.instance_instance();
        C1.static_instance();
        c.static_instance();// 클래스 매소드는 인스턴스 통해서도 접근가능
//        C1.instance_instance();//인스턴스 매소드는 클래스에서 접근 불가
    }
}
