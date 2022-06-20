package java_lecture_151_;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
public class IteratorDemo {

    public static void main(String[] args){
//        hashset, arraylist 는 collection 이 구현되어 있고 collection 은 iterator 이
//        존재함
//        HashSet<Integer> A = new HashSet<Integer>();// Iterator 제공
//        ArrayList<Integer> A = new ArrayList<Integer>();// Iterator 제공
        Collection<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);

        Iterator hi = A.iterator();// 오리지널 집합을 복제한 집합
        while(hi.hasNext()){//.hasNext() -> 값이 있는지 확인
            System.out.println(hi.next());// 값을 하나 리턴해주고 hi 안에서 삭제
        }
    }
}
