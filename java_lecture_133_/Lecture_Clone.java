package java_lecture_133_;

class Human{
    protected String test(){
        return "test";
    }
}
class Student_1 extends Human implements Cloneable{// 복제가능을 명시
    String name;
    Student_1(String name){
        this.name = name;
    }
    public Object clone() throws CloneNotSupportedException{
//   클론함수는 예외처리 필요
        return super.clone();
    }

}
public class Lecture_Clone {
    public static void main(String[] args){
        Student_1 s1 = new Student_1("egoing");
        s1.test();//같은 패키지 소속이여서 실행가능
        try{
            Student_1 s2 = (Student_1) s1.clone();
            System.out.println(s1.name);
            System.out.println(s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
