package C02MethodClass;
//재귀함수  활용 대표적인 알고리즘 예시 : 백트래킹 , dfs 알고리즘에서 주로 사용한다. (또는 분할정복)
//대표적인 백트래킹 예시 : 조합과 순열에서 경우의 수 찾기


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class C13RecursiveCombiePermu {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
//                System.out.println("hello");
            }
        }
//위 for문의 반복횟수는(개수)는 동적으로 결정되지 않고, 정적으로 코딩할 수 밖에 없는 한계가 존재

//        Recursivefor(0,2);

        /*
//        List<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
//        숫자 1,2,3,4를 가지고 만들 수 있는 2개짜리 숫자 조합을 이중 리스트에 담아 출력
List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<mylist.size(); i++) {
            for(int j= i+1; j<mylist.size(); j++) {
                List<Integer> list1 = new ArrayList<>();
                list1.add(mylist.get(i));
                list1.add(mylist.get(j));
                list.add(list1);
            }
        }
//        System.out.println(list);
*/


//        재귀를 만들기 위한 for문 변형
//        List<Integer> mylist = new ArrayList<>();
//        mylist.add(1);
//        mylist.add(2);
//        mylist.add(3);
//        mylist.add(4);
//        List<List<Integer>> list = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        for(int i=0; i<mylist.size(); i++) {
//            temp.add(mylist.get(i));
//            for(int j= i+1; j<mylist.size(); j++) {
//                temp.add(mylist.get(j));
//                list.add(new ArrayList<>(temp)); //add할 때마다 새로운 객체 생성(같은 메모리 주소 중복 가능성 x)
//                temp.remove(temp.size()-1);
//            }
//            list1.remove(temp.size()-1);
//
//        }
//        System.out.println(list);

//        for(int i =0; i<list.size(); i++) {
//            for(int j =i+1; j< list.size(); j++) {
//                System.out.println(list.get(i) + " "+ list.get(j));
//            }
//        }


        List<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
//        List<List<Integer>> doublelist = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
//        combie(mylist, 2, 0, doublelist, temp); //mylist 원본, 2개짜리 조합, 조합을 담을 이중리스트
//        System.out.println(doublelist);

        List<List<Integer>> doublelist = new ArrayList<>();
       boolean[] visit = new boolean[mylist.size()];
        for(int i=0; i<mylist.size(); i++) {
            temp.add(mylist.get(i));
            visit[i] = true;
            for(int j= i+1; j<mylist.size(); j++) {
                if(visit[j]) continue;
                temp.add(mylist.get(j));
                visit[j]=true;
                doublelist.add(new ArrayList<>(temp)); //add할 때마다 새로운 객체 생성(같은 메모리 주소 중복 가능성 x)
                temp.remove(temp.size()-1);
                visit[j] =false;
            }
            temp.remove(temp.size()-1);
            visit[i]=false;

        }
        System.out.println(doublelist);

        permu(mylist, 2, doublelist, temp,new boolean[mylist.size()]);
        System.out.println(doublelist);

//        코드 타이핑 모르면 컨닝 다시 타이핑 자연스레 외워짐
//        외워지면 아래 문제 시도
//      백준 : 15649, 6603

    }

    public static void combie(List<Integer> mylist, int n, int start, List<List<Integer>> doublelist, List<Integer> temp) {
        if (temp.size() == n) {
            doublelist.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < mylist.size(); i++) {
            temp.add(mylist.get(i));
            combie(mylist, n, i+1, doublelist, temp);
            temp.remove(temp.size() - 1);
        }

    }

    public static void permu(List<Integer> mylist, int n, List<List<Integer>> doublelist, List<Integer> temp, boolean[] visit) {
        if (temp.size() == n) {
            doublelist.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < mylist.size(); i++) {
            if(visit[i]) continue;
            visit[i] = true;
            temp.add(mylist.get(i));
            permu(mylist,n,doublelist,temp,visit);
            temp.remove(temp.size() - 1);
            visit[i]=false;
        }

    }
//    public static void Recursivefor(int n, int m) {
//       if(n==m) {
////           System.out.println("hello");
//           return;
//       }
//        for(int i =0; i<3; i++) {

    /// /            System.out.println("hello"); //이렇게 실행하면 3^n형식이 아님;
//            Recursivefor(n+1,
//            m); //for문을 계속 불러오는 형태임
//            System.out.println("hello"+i);
//
//        }
//    }
    public static void make() {

    }

}
