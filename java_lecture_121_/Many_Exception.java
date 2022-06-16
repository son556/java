package java_lecture_121_;
class A{
    private int[] arr = new int[3];
    A(){
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }
    public void z(int first, int second){
        try {
            System.out.println(arr[first] / arr[second]);
        } catch (ArithmeticException e){//수학적 예외인 경우 작동
            System.out.println("ArithmeticException e");
        } catch (ArrayIndexOutOfBoundsException e){// 배열 인덱스 에러인 경우 작동
            System.out.println("ArrayIndexOutOfBoundsException e");
        } catch (Exception e){// 예외처리시 작동, 다른 예외처리가 있는경우 제일 위로가면 오류
            System.out.println("e");
        }
    }
}
public class Many_Exception {
    public static void main(String[] args) {
        A a = new A();
        a.z(1,0);
    }
}
