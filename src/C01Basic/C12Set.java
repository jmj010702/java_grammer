package C01Basic;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C12Set {
    public static void main(String[] args) throws IOException {

//       set의 특성 : 중복X 순서보장X 성능 O(1);
        Set<String> set = new HashSet<>();

        set.add("야구");
        set.add("농구");
        set.add("배구");
        set.add("축구");
        set.add("농구");
        System.out.println(set);
        System.out.println(set.contains("야구")); //O(1)의 복잡도

//        TreeSet : data를 오름차순으로 정렬
        Set<String> set1 = new TreeSet<>();
        set1.add("야구");
        set1.add("농구");
        set1.add("축구");
        set1.add("농구");
        System.out.println(set1);

//        수찾기 1920 set으로 다시 풀기
//         백준 숫자카드 10815

//        프로그래머스 : 폰켓몬


//        집힙관련함수: 교집합, 합집합, 차집합
//                  retainAll addAll removeAll


        Set<String> s1=new HashSet<>();
        Set<String> s2=new HashSet<>();
        s1.add("java");
        s1.add("python");
        s1.add("C++");
        s2.add("java ");
        s2.add("html");
        s2.add("jcss");
        s1.retainAll(s2); // s1에는 교집합 남음(java)
        s1.addAll(s2); // s1에는 합집합 남음(java,python,c++,html,css)
        s1.removeAll(s2); // s1에는 차집합 남음(python, c++)


    }
}
