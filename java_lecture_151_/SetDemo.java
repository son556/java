package java_lecture_151_;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;

public class SetDemo {

    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        // set 은 get 이 없음 -> set 은 순서가 없어 인덱스와 관련된 api 가 없음
        HashSet<Integer> B = new HashSet<Integer>();//set 은 순서대로 값이 입력 X
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);

        System.out.println(A.containsAll(B)); // false a 안에 b 의 일부만 들어가있다.
        System.out.println(A.containsAll(C)); // true a 안에 c 가 전부 들어가있다.

//        A.addAll(B); // a b 합집합을 a 라는 집합으로 만든다.
//        A.retainAll(B); // a b 모두 있는 값만 a 로 만든다.
        A.removeAll(B); // a 에서 b 에 해당하는 요소를 전부 뺀다.

        Iterator hi = A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }

}

