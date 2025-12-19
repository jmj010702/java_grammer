package C05AnonyMousLamda;

import java.io.IOException;
import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) throws IOException {
//        java에서는 비교를 위한 인터페이스가 대표적으로 2개가 제공된다
//      1.  Comparator인터페이스 : 인터페이스내 compareTo 메서드만 존재
//      2.  Comparable인터페이스 : 인터페이스내 compare 메서드만 존재

        List<Integer> mylist = new ArrayList<>();
        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
//        java의 대부분의 정렬함수는 매개변수로 Comparator객체 요구
        mylist.sort(Comparator.naturalOrder());
//        O1과 O2의 숫자값을 마이너스 형식으로 코딩을 하되,
//        O1이 먼저 있으면 오름차순, O2가 먼저 있으면 내림차순
        mylist.sort((o1, o2) -> o1-o2);

        List<String> mylist2 = new ArrayList<>();
        mylist2.add("javaqw");
        mylist2.add("C++aqw");
        mylist2.add("python");
//        기본적인 문자열정렬일때에는 Comparator커스텀을 하지않고,
//        복잡한 자신만의 정렬기준을 가지고 정렬해야 할 때 Comparator 익명개체 생성.
//        ex)문자열의 길이로 정려하되, 문자열의 길이가 같은 경우에는 알파벳 순으로 정렬
        mylist2.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                return o1.length()- o2.length();
            }
        }
        });
        System.out.println(mylist2);

        //백준 단어 정렬

//        배열, 리스트 정렬외에 java의 그 외 정렬자료구조
        Queue<String > pq = new PriorityQueue<>((o1, o2) -> o1.length()-o2.length());
        Set<String> treeset = new TreeSet<>((o1, o2) -> o1.length()-o2.length());
//      백준 최대값 힙

//        백준 선긋기
        // test



    }
}
