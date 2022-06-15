package java_lecture_111_;
// 인터페이스 맴버는 반드시 public이어야 한다. 인터페이스는 안에 로직이 있으면 안됨
interface I1{
    public void x();
}

interface I2 extends I1{//인터페이스는 다른 인터페이스 상속가능
    public void z();
}
class A implements I1, I2{// 인터페이스는 하나의 클래스에서 여러개 인터페이스 상속가능
    @Override
    public void x() {

    }

    @Override
    public void z() {

    }
}
public class interface_inheritance {
}
