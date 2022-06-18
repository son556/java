package java_lecture_142_;
class A{
    public int id;
    A(int id){
        this.id = id;
    }
}
public class Lecture_Reference {
    public static void runValue(){
        int a = 1;// 변수타입의 기본형은 복제
        int b = a;// a 의 값을 복제하여 b에 넣음
        b = 2;
        System.out.println("runValue, "+a);// a 의 값은 변화 없음
    }
    static void _reference1(A b){
        b = new A(2);
    }
    static void runReference1(){
        A a = new A(1);
        _reference1(a);
        System.out.println("runReference1, "+a.id);
    }
    static void _reference2(A b){
        b.id = 2;
    }

    static void runReference2(){
        A a = new A(1);
        _reference2(a);
        System.out.println("runReference2, "+a.id);
    }
    public static void main(String[] args){
//        A a = new A(1); // A 인스턴스, a 는 주소값을 가짐
//        A b = a;// A 인스턴스, b 는 주소값을 가짐
////        b = new A(2); // a 와 다른 인스턴스를 가져 아래 print 문에 2출력
//        b.id = 2;// 값이 변경됨
//        System.out.println("runReference, "+a.id);// a.id 값이 변화됨(참조)
        runValue();
        runReference1();
        runReference2();
    }
}
