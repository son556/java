package java_lecture_151_;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        a.put("one", 1);
        a.put("two", 2);
        a.put("three", 3);
        a.put("four", 4);
        System.out.println(a.get("one"));
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));

        iteratorUsingForEach(a);
        iteratorUsingIterator(a);
    }

    static void iteratorUsingForEach(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    static void iteratorUsingIterator(HashMap map){
        // .entry (key, value) 를 entries 라는 set type 변수에 담음
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        // Iterator 을 이용해 entries 복제
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();
        while(i.hasNext()){// 값이 있는지 확인
            Map.Entry<String, Integer> entry = i.next();// 값 반환 후 삭제
            // entyry.getKey() 키값 반환, entry.getValue() 벨류값 반환
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

}