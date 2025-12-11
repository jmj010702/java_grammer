//package C01Basic;
//class Solution {
//    public int solution(String A, String B) {
//        // A와 B가 이미 같으면 0 반환
//        if(A.equals(B)) {
//            return 0;
//        }
//        String temp = A;
//        for(int i = 1; i < A.length(); i++) {
//
//            temp = temp.charAt(temp.length() - 1) + temp.substring(0, temp.length() - 1);
//
//            if(temp.equals(B)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}


import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

//class Solution {
    /*
    public int[] solution(int[] numbers) {
        int index = 0;

        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        int[] my = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                my[i] = numbers[i] + numbers[j];
            }
        }

        for (int a : my) {
            set.add(a);
        }
        int[] answer = new int[set.size()];

        for (int a : set) {
            answer[index] = a;
            index++;
        }


        Arrays.sort(answer);
        return answer;
    }
*/

    /*
   import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
    class Solution {
        public int[] solution(int[] numbers) {
            Set<Integer> set = new HashSet<>();


            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    set.add(numbers[i] + numbers[j]);
                }
            }


            int[] answer = new int[set.size()];
            int idx = 0;
            for (int v : set) {
                answer[idx++] = v;
            }

            Arrays.sort(answer);

            return answer;
        }
    }
*/