package C02MethodClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class study {
    public static void main(String[] args) throws IOException {

List<Integer> list = Arrays.asList(1,2,3,4);
    List<List<Integer>> result = new ArrayList<>();
//    Combie(list, 0 , 2, new ArrayList<>(), result);
//        System.out.println(result);

//        Permu(list, 2, new boolean[list.size()], new ArrayList<>(), result);
//        System.out.println(result);
//      백준 : 15649, 6603


//        Permu(list, 2, new boolean[list.size()], new ArrayList<>(), result);


//        Combie(list,0,2,new ArrayList<>(), result);
//        System.out.println(result);

        Permu(list,2,new boolean[list.size()], new ArrayList<>(), result);
        System.out.println(result);
    }

    /*
 public static void Combie(List<Integer> list, int start,int n, List<Integer> temp, List<List<Integer>> result) {
        if(temp.size() == n) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start; i<list.size(); i++) {
            temp.add(list.get(i));
            Combie(list, i+1,n, temp, result);
            temp.remove(temp.size()-1);
        }
 }

 public static void Permu(List<Integer>list, int n, boolean[] visit, List<Integer> temp, List<List<Integer>> result) {
if(temp.size() == n) {
    result.add(new ArrayList<>(temp));
    return;
}

for(int i =0; i<list.size(); i ++) {
    if(visit[i]) continue;
    temp.add(list.get(i));
    visit[i] =true;
    Permu(list, n, visit, temp,result);
    temp.remove(temp.size()-1);
    visit[i] = false;


}

    public static void Permu(List<Integer> list, int n, boolean[] visit, List<Integer> temp, List<List<Integer>> result) {
        if (temp.size() == n) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i =0; i<list.size(); i++) {
            if(visit[i]) continue;
            temp.add(list.get(i));
            visit[i] =true;
            Permu(list,n,visit, temp, result);
            temp.remove(temp.size()-1);
            visit[i] = false;
        }
    }*/


    public static void Combie(List<Integer> list, int start, int n, List<Integer> temp, List<List<Integer>> result) {
        if(temp.size() == n) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i = start; i<list.size(); i++) {
            temp.add(list.get(i));
            Combie(list,i+1,n,temp,result);
            temp.remove(temp.size()-1);
        }
    }

    public static void Permu(List<Integer> list, int n, boolean[] visit, List<Integer> temp, List<List<Integer>> result) {
        if (temp.size() == n) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i =0; i<list.size(); i++) {
            if(visit[i]) continue;
            temp.add(list.get(i));
            visit[i] =true;
            Permu(list,n,visit, temp, result);
            temp.remove(temp.size()-1);
            visit[i] = false;
        }
    }

 }






