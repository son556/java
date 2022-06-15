package java_lecture_104_;
abstract class A1{
    public abstract int b();//추상 메소드-> 오버라이딩 필요
//    추상메소드는 구체적인 키워드{내용}를 갖을 수 없다
//    public abstract void c(){System.out.println("hello")}
//    추상 클래스 내에는 추상 메소드가 아닌 메소드를 가질 수 있다.
    public void d(){
        System.out.println("world");
    }
}
class B extends A1{// 상속
    public int b(){// overriding
        return 1;
    }
}
public class AbstractDemo {
    public static void main(String[] args){
//        A1 obj = new A();// 추상클래스는 반드시 상속으로 사용
        B obj = new B();
    }
}
// abstract -> 상속을 강제, 사용목적: 사용자가 직접 구현해서 쓸 수 있게 만듦