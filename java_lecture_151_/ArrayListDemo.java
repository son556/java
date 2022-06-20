package java_lecture_151_;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        // arrayObj[2] = "three"; 오류가 발생한다. 인덱스 오류
        for(int i=0; i<arrayObj.length; i++){
            System.out.println(arrayObj[i]);
        }
//        아래 제너릭을 통해 굳이 형변환 하지 않아도 String 으로 사용가능
        ArrayList<String> al = new ArrayList<String>();// 크기를 지정해줄 필요가 없음
        al.add("one");// 어떤 인자도 수용하기 위해 입력하는 인자가 Object 타입으로 저장
        al.add("two");
        al.add("three");
        for(int i=0; i<al.size(); i++){
//            String value = al.get(i);//오류발생 al의 데이터 타입이 Object 타입이라 에러
//            String value = (String)al.get(i);// 형변환 필요
            System.out.println(al.get(i));
        }
    }

}