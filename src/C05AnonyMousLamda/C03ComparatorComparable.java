package C05AnonyMousLamda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        mylist.sort((o1, o2) -> o1 - o2);

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
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
//        System.out.println(mylist2);

        //백준 단어 정렬

//        배열, 리스트 정렬외에 java의 그 외 정렬자료구조
        Queue<String> pq = new PriorityQueue<>((o1, o2) -> o1.length() - o2.length());
        Set<String> treeset = new TreeSet<>((o1, o2) -> o1.length() - o2.length());
//      백준: 절대값 힙
        /*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

        public class infiniteheap_11286  {
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int n = Integer.parseInt(br.readLine());
                StringBuilder sb=  new StringBuilder();
                Queue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        if(Math.abs(o1) - Math.abs(o2) == 0) {
                            return o1-o2;
                        } else {
                            return Math.abs(o1) - Math.abs(o2);
                        }
                    };
                });

                for(int i =0; i <n; i++) {
                    int x = Integer.parseInt(br.readLine());

                    if(q.isEmpty() && x ==0) {
                        sb.append(0).append("\n");
                    } else if (x == 0) {
                        sb.append(q.poll()).append("\n");
                    } else {
                        q.offer(x);
                    }
                }


                System.out.println(sb);

            }
        }

        */

//        백준 선긋기
//        배열 안의 배열 정렬 ;
//        [ {4,5}, {1,2} , {5,0}, {3,1} ]
//          리스트 안의 배열의 index를 기준으로 오름차순 정렬
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{4, 5});
        list.add(new int[]{1, 2});
        list.add(new int[]{5, 0});
        list.add(new int[]{3, 1});

        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }

            ;
        });

        for (int i = 0; i < list.size(); i++) {
//          System.out.println(Arrays.toString(list.get(i)));
        }

//    직접 만든 객체 정렬

        List<student> studentList = new ArrayList<>();
        studentList.add(new student("hong1", 21));
        studentList.add(new student("hong2", 20));
        studentList.add(new student("hong3", 23));
        studentList.add(new student("hong4", 22));
//      방법1. Comparator 를 구현한 익명 객체 방식
        studentList.sort(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
//                return o1.getAge() - o2.getAge();
                return o1.getName().compareTo(o2.getName());
            }
        });

//       방법2. Comparable 을 구현한 방식
//        student객체 안에 Comparable 을 implements하는 방식
//        sort 실행시 자동으로 students안의 compareTo메서드 호출
        Collections.sort(studentList);


        for (student a : studentList) {
            System.out.println(a.getAge());
        }
    }
}

class student implements Comparable<student> {

    private String name;
    private int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    //    Comparable의 compareto에서는 this와 매개변수로 주어지는 객체와 비교
//    this가 앞에 있으면 오름차순, 매개변수 객체가 앞에 있으면 내림차순
    @Override
    public int compareTo(student o) {
        return this.getName().compareTo(o.getName());
    }
}