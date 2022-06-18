package java_lecture_142_;
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T, S>{
    public T info;
    public S id;
    Person(T info, S id){
        this.info = info;
        this.id = id;
    }
    public <U> void printInfo(U info){
        System.out.println(info);
    }
}
public class Generic {
    public static void main(String[] args) {
        Integer id = 1;
        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1), id);
        System.out.println(p1.id.intValue());
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = new Integer(10);
        Person p2 = new Person(e, i);
        p2.printInfo(e);
    }// generic 에는 기본데이터 타입이 오지 못함
    // wrapper class 를 사용 int -> Integer
}
