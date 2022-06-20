package java_lecture_151_;
import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;

public class ListSetDemo {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("two");
        al.add("three");
        al.add("three");
        al.add("five");
        System.out.println("array");
        Iterator ai = al.iterator();
        while(ai.hasNext()){
            System.out.println(ai.next());
        }

        HashSet<String> hs = new HashSet<String>();
        hs.add("one");
        hs.add("two");
        hs.add("two");
        hs.add("three");
        hs.add("three");// 이미 three 가 저장되어 저장되지 않음
        hs.add("five");
        Iterator hi = hs.iterator();
        System.out.println("\nhashset");
        while(hi.hasNext()){//hi 라는 hashset 에서 데이터를 하나씩 뽑아옴
            System.out.println(hi.next());
        }
    }

}
