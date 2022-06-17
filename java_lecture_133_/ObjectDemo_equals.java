package java_lecture_133_;
class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    public boolean equals(Object obj){// Object obj = s2 다형성참조
        Student s = (Student)obj;// 강제로 형변환
        return this.name == s.name;// 이름만 같으면 true
    }
}
public class ObjectDemo_equals {
    public static void main(String[] args){
        Student s1 = new Student("eco");
        Student s2 = new Student("eco");
        System.out.println(s1 == s2);// 데이터 타입이 달라 false
        System.out.println(s1.equals(s2));//overriding 을 통해 설정
    }
}
