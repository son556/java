package java_lecture_104_;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z();
    }
}

public class accessmodifier {//하나의 소스코드안에는 하나의 public class 만 존재가능
    public static void main(String[] args){
        A a = new A();
        System.out.println(a.y());
//        System.out.println(a.z()); // error private-> 클래스에서 직접 호출 불가능
        System.out.println(a.x());
    }
}
