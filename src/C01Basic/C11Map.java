package C01Basic;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.io.IOException;
import java.util.*;

public class C11Map {
    public static void main(String[] args) throws IOException {

        /*
//        Map : key, value로 이루어진 자료구조
        Map<String, Integer> sports = new HashMap<>();
//         튿징 : 키는 중복이 없음. value는 중복이 가능.
        sports.put("농구" , 2);
        sports.put("축구" , 3);
        sports.put("배구" , 2);
        sports.put("농구" , 3); //key값이 겹친다면 덮어써진다
//      map key에는 순서가 없음
//        System.out.println(sports);
//      특징 :  map에서 key값을 통한 검색 복잡도는 o(1)이다
//        System.out.println(sports.get("배구"));

//        map에 전체 value 데이터 출력
//        map의 key값 접근시에는 인덱스 사용 불가능(순서가 없음)
//        keyset() : map의 전체 key목록을 반환하는 메서드
//         key에 먼저 접근해서 value를 가져옴
        for(String a : sports.keySet()) {
                System.out.println("key" + a + "value" + sports.get(a));
            }

//          values() : map의 전체 value목록을 반환하는 메서드 (잘 안쓰임)
        for(int a :sports.values()) {
            System.out.println(a);
        }
//        o(1) 복잡도 get
//        해시함수를 사용한 해시테이블
//        많은 메모리양 확보


        Map<String, Integer> sports = new HashMap<>();
        sports.put("축구", 2);
        sports.put("농구", 3);
        sports.put("배구", 2);

//        remove : key를 통해 map요소 삭제
        sports.remove("축구");
        System.out.println(sports);

//      putIfAbsent : key값이 없는 경우에만 put
        sports.putIfAbsent("배구", 10);

//        containsKey : 키가 있으면 true 없으면 fasle
        System.out.println(sports.containsKey("배구"));
        System.out.println(sports.containsKey("탁구"));

//      map을 통한 개수 count
        String[] arr = {"농구","축구","축구","야구","야구","야구"}; //농구 :2 야구 : 3 축구 :2
        Map<String, Integer> map = new HashMap<>();
//        담으려고 한 key가 있으면 기존꺼 +1 없으면 1로세팅

        for(String i :arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(map);
        System.out.println(map.get("축구")); //get은 해당 키값에  value를 반환

//        getorDefault (키값, 초기화) : key값이 없을 경우 초기값 반환 key값이 있으면 있는 값 리턴, 없을경우 초기값 리턴
        String[] arr = {"농구", "축구", "축구", "야구", "야구", "야구"}; //농구 :2 야구 : 3 축구 :2
        Map<String, Integer> map = new HashMap<>();
        for (String a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1); //있으면 map.get(a)반환(+1을하면 있는경우에 기존 값에 +1)  없으면 0으로 초기화
        }

//        map에 value값 감소 로직
        String[] arr2 = {"농구", "농구", "농구", "야구", "야구", "야구", "축구"};
        for (String a : arr2) {
            if (map.containsKey(a)) { //a가 map에 있다면
                if (map.get(a) == 1) { //a가 map에 있고 키값에 value가 1이라면
                    map.remove(a); // map을 삭제
                } else {
                    map.put(a, map.get(a) - 1); // a가 map에 있지만 키값에 value가 2이상이라면 -1                 }
                }
            }
            System.out.println(map);
        }

//        프로그래머스 : 완주하지 못한 선수
        import java.io.IOException;
import java.util.*;
        class Solution {
            public String solution(String[] participant, String[] completion) {
                Map<String, Integer> map = new HashMap<>();
                for(String i : participant) {
                    if(map.containsKey(i)) {
                        map.put(i,map.get(i)+1);
                    } else {
                        map.put(i,1);
                    }
                }
                for(String i : completion) {
                    if(map.containsKey(i)) {
                        if (map.get(i) == 1) {
                            map.remove(i);
                        } else {
                            map.put(i, map.get(i)-1);
                        }
                    }
                }
                String answer = "";
                for(String i : map.keySet()) {
                    answer = i;
                }
                return answer;
            }
        }


//        프로그래머스 의상
import java.io.IOException;
import java.util.*;

public class test {
    public static void main(String[] args) throws IOException {

        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Map<String, Integer> map = new HashMap<>();
        int answer = 1;

        for (String[] a : clothes) { //clothes의 2차원 배열이 a로 전달됨
            if (map.containsKey(a[1])) {
                map.put(a[1], map.get(a[1]) + 1);
            } else {
                map.put(a[1], 1);
            }
        }

    for(String a : map.keySet()) {
        int n = map.get(a) + 1;
        answer *= n;
    }
//        1번 인덱스에 어떻게 접근을 할 것인가
//return answer -1;
    }
}


//        가장 value 가 큰 key값 찾기
        Map<String , Integer> map = new HashMap<>();
        map.put("축구", 2);
        map.put("농구", 3);
        map.put("배구", 2);
//        keyset() : map의 전체 key목록을 반환하는 메서드
        int max = Integer.MIN_VALUE;
        String maxkey = "";
        for(String a : map.keySet()){
            int value = map.get(a); //get은 a의 value를 반환
            if(max<value) {
                max = value;
                maxkey = a;
            }
        }
        System.out.println(maxkey);
*/

//        treeMap : key를 정렬(오름차순)하여 map을 저장
        Map<String, Integer> map = new TreeMap<>();
        Map<String, Integer> map1 = new TreeMap<>(Comparator.reverseOrder()); //key갑 기준 내림차순
        map.put("hello5", 1);
        map.put("hello4", 2);
        map.put("hello3", 3);
        map.put("hello2", 4);
        map.put("hello1", 5);

        System.out.println(map);

//      백준 : 파일정리

//        iterator를 활용한 출력
//        Map<String, Integer> myMap=new HashMap<>();
//        myMap.put("야구", 2);
//        myMap.put("축구", 3);
//        myMap.put("농구", 2);
//        Iterator<String> iters=myMap.keySet().iterator();
//       next메서드는 데이터를 하나씩 소모시키면서 값을 반환
//       System.out.println(iters.next());
//       hasNext메서드는 iterator안에 그 다음값이 있는지 없는지 boolean 리턴
//       System.out.println(iters.hasNext());
//        while(iters.hasNext()) {
//            System.out.println(iters.next());
//        }








    }
}

