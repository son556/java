package java_lecture_142_;
abstract class Info{
    public abstract int getLevel();
}
class EmployeeInfo_1 extends Info{
    public int rank;
    EmployeeInfo_1(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
class Person_1<T extends Info>{// < extends 는 부모가 누구 인지 나타냄>
    public T info;
    Person_1(T info){ this.info = info; }
}
public class GenericDemo {
    public static void main(String[] args) {
        Person_1<EmployeeInfo_1> p1 = new Person_1<EmployeeInfo_1>(new EmployeeInfo_1(1));
//        Person_1<String> p2 = new Person_1<String>("부장");//String 은 Info의 자식이 아니다-> error
    }
}
