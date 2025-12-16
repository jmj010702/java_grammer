package C01Basic;

public class C13QueueStackDeque {
    public static void main(String[] args) {
        ///* ************ Queue ************ *///
        // 가장 먼저 저장된(push) 데이터가 가장 먼저 인출(pop)되는 선입선출(FIFO)의 자료 구조
        // Queue 구현체 종류 : LinkedList, 길이제한 큐, 우선순위 큐
//        Queue<Integer> myQue = new LinkedList<>();

        ///* ************ Queue의 주요 메서드 ************ *///
        //📍.add() : 큐의 가장 마지막에 데이터를 입력
        //📍.poll() : 큐에서 가장 앞의 데이터를 삭제하면서, 동시에 return
        //📍.peek() : 큐에서 가장 앞의 데이터를 삭제하지 않고 return
        //📍.offer() : 길이제한 큐에서 제한된 범위까지만 추가
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println("Queue Before: " + myQue); // [10, 20, 30]
//
//        int value1 = myQue.poll();
//        System.out.println("poll : " + value1); // 10
//        System.out.println("Queue poll After : " + myQue); // [20, 30]
//
//        int value2 = myQue.peek();
//        System.out.println("poll : " + value2); // 20
//        System.out.println("Queue poll After : " + myQue); // [20, 30]

        ///* ************ 가장 많이 사용되는 일반적인 큐 : LinkedList⭐ ************ *///
        //📍 while문을 통한 Queue 출력 방식 확인
        // 프린터 만들기
//        Queue<String> printerQueue = new LinkedList<>();
//        printerQueue.add("문서1");
//        printerQueue.add("문서2");
//        printerQueue.add("문서3");
//        printerQueue.add("문서4");
//        while (!printerQueue.isEmpty()) {
//            System.out.println("프린트 : " + printerQueue.poll());
//        }

        ///* ************ LinkedList와 ArrayList의 성능 차이 비교 ************ *///
        // ArrayList
        // 장점: 조회 성능 빠름 (O(1))
        // 단점: 중간 삽입/삭제 성능 저하 (O(N))

        // LinkedList
        // 장점: 중간 삽입/삭제 성능 빠름 (O(1))
        // 단점: 조회 성능 저하 (O(N))

        // 요구사항: 10만개의 데이터를 0번째에 계속 삽입 (중간 삽입 테스트)
        // ArrayList: 10만번 삽입 → O(N^2) = 약 50억 연산
        // LinkedList: 10만번 삽입 → O(N) = 약 10만 연산

        // 참고: 보통 1초에 약 1억번 연산 처리 가능
        // 성능 확인 방법: 코드 시작 전/후 System.currentTimeMillis()로 시간 측정 후 차이 계산
//        LinkedList<Integer> my_l_list = new LinkedList<>();
//        long start_time_1 = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            my_l_list.add(0, i);
//        }
//        long end_time_1 = System.currentTimeMillis();
//        System.out.println("LinkedList 중간에 값 add 시 소요시간 : " + (end_time_1 - start_time_1));
//
//        ArrayList<Integer> my_a_list = new ArrayList<>();
//        long start_time_2 = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            my_a_list.add(0, i);
//        }
//        long end_time_2 = System.currentTimeMillis();
//        System.out.println("ArrayList 중간에 값 add 시 소요시간 : " + (end_time_2 - start_time_2));

        // 10만개 데이터 삽입 시 예시)
        //LinkedList 중간에 값 add 시 소요시간 : 16
        //ArrayList 중간에 값 add 시 소요시간 : 362

        // 100만개 데이터 삽입 시 예시)
        //LinkedList 중간에 값 add 시 소요시간 : 141
        //ArrayList 중간에 값 add 시 소요시간 : 55817

        ///* ************ 길이제한 큐 : ArrayBlockingQueue ************ *///
        // 제한된 길이 이상 add 사용시에는 exception 발생
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
        /* // add 사용
        blockingQueue.add("문서1");
        blockingQueue.add("문서2");
        blockingQueue.add("문서3");
        blockingQueue.add("문서4"); // 제한된 길이 이상 insert 시(길이 초과) IllegalStateException 에러 발생
        */
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4"); // 제한된 길이까지만 add, 에러 발생 X
//        System.out.println("길이제한 큐 : " + blockingQueue);


        ///* ************ 우선순위 큐 : PriorityQueue⭐ ************ *///
        // 힙 자료구조로 LinkedList와 완전히 다른 자료 구조
        /*📍 핵심 특징
         * - 데이터를 poll() 할 때 항상 정렬된 결과값(최소값/최대값) 보장
         * - poll() 한 번당 복잡도: O(log N)
         * - 전체 데이터 poll 시 총 복잡도: N * log N
         */

        /*📍 PriorityQueue vs List + sort 비교

         * PriorityQueue가 적합한 상황:
         * 지속적으로 데이터 추가/제거 + 실시간 최소값 추출 필요

         * List + sort가 적합한 상황:
         * 데이터를 모두 모은 후 한 번만 정렬하는 경우
         */

        /*📍 복잡도 비교표

         * PriorityQueue:
         * - add()     : O(log N)
         * - peek()    : O(log N)
         * - 전체 peek : N * log N

         * List + Collections.sort():
         * - add()     : O(1)
         * - sort()    : N * log N (한 번만)
         * - get(0)    : O(1)
         */

        /*📍 실제 사용 예시
         * 입력 순서: [10, 40, 20, 30]
         * PriorityQueue.peek() 순서: 10 → 20 → 30 → 40 (자동 정렬)

         * 실시간 시나리오:
         * 1. pq.add(10), pq.peek() → 10 꺼냄
         * 2. pq.add(5),  pq.peek() → 5 꺼냄
         * 3. pq.add(15), pq.peek() → 15 꺼냄
         * 매 peek마다 O(log N)으로 최소값 즉시 확인
         * 이 때 peek은 최소값 확인만 하고 추출은 X(poll과 peek 모두 복잡도 동일)
         */

        /*📍 List 사용 시 문제점
         * List에 10만개 추가 → sort() → O(N log N)
         * 새로운 데이터 add(새로운 최소값) → 정렬 깨짐!
         * 다시 sort() → 또 O(N log N)
         * 총 N번 → n^2 * log N (재앙)
         */

        /*📍 결론
         * 정렬 유지하며 실시간 최소/최대값 추출 → PriorityQueue O(N log N)
         * 한 번 정렬 후 사용 → List + sort O(N log N)

         * PriorityQueue = 실시간 정렬 유지 전문
         */

        //📍 최소힙 : poll 할 때 마다 최소값 추출
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println("pq : " + pq); // 이 때 힙 정렬 구조를 맞추고 있음 [10, 30, 20, 40, 50]
//        while (!pq.isEmpty()) {
//            System.out.println("우선순위 큐 poll : " + pq.poll());
//        }

        //📍 최대힙 : poll 할 때 마다 최대값 추출
//        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

        // [📝관련문제] 백준 - 카드2
        // https://www.acmicpc.net/problem/2164
        // "제일 위에 있는 카드를 바닥에 버린다." -> 여기서 큐를 사용해야한다는 걸 인지해야함

        // [📝관련문제] 백준 - 요세푸스0
        // https://www.acmicpc.net/problem/11866
        // "이제 순서대로 K번째 사람을 제거한다." -> 역시나 큐를 사용해야함

        // [📝관련문제] 백준 - 최소힙
        // https://www.acmicpc.net/problem/1927
        /*
        import java.io.*;
        import java.util.*;

        // 최소힙
        public class S1927 {
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int n = Integer.parseInt(br.readLine()); //연산의 개수
                // 자연수 -> 추가하는 연산
                // 0 -> 가장 작은 값 출력 후 배열에서 제거
                int answer = 0;
                Queue<Integer> pq = new PriorityQueue<>();
                for (int i = 0; i < n; i++) {
                    int x = Integer.parseInt(br.readLine());
                    if (x == 0) {
                        if (!pq.isEmpty()) {
                            answer = pq.poll();
                        } else {
                            answer = 0;
                        }
                        System.out.println(answer);
                    } else {
                        pq.add(x);
                    }
                }

            }
        }*/


        // [📝관련문제] 프로그래머스 - 더 맵게
        // https://school.programmers.co.kr/learn/courses/30/lessons/42626
        // 위 문제의 특징 : 최소를 꺼내서(poll) 연산 후 add -> 또 다시 최소를 꺼내서(poll) 연산 후 add (따라서 pq를 써야하는 문제)
        /*
        import java.util.PriorityQueue;
        import java.util.Queue;

        class Solution {
            public int solution(int[] scoville, int K) {
                Queue<Integer> pq = new PriorityQueue<>();
                for (int a : scoville) {
                    pq.add(a);
                }

                int answer = 0;

                while (pq.peek() < K) {
                    if (pq.size() < 2) {
                        answer = -1;
                    }
                    if(answer==-1)break;
                    int min_s = pq.poll() + (pq.poll() * 2);
                    pq.add(min_s);
                    answer++;
                }

                return answer;
            }
        }
        */

        ///* ************ Stack ************ *///
        // 후입 선출의 자료 구조(바로 직전의 값을 확인하는 문제)
//        Stack<Integer> myStack = new Stack<>();

        ///* ************ Stack의 주요 메서드 ************ *///
        //📍.push() : 스택의 가장 마지막에 데이터 입력
        //📍.pop() : 스택의 가장 마지막에 입력한 데이터를 꺼내는고 삭제
        //📍.peek() : 스택의 가장 마지막에 입력한 데이터를 확인만 함

//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//        System.out.println(myStack.pop());


        // [📝관련문제] 프로그래머스 - 올바른 괄호
        // https://school.programmers.co.kr/learn/courses/30/lessons/12909
        /*
        import java.util.Stack;

        class Solution {
            boolean solution(String s) {
                boolean answer = true;

                char[] ch = s.toCharArray();
                Stack<Character> st = new Stack<>();

                for (int i = 0; i < ch.length; i++) {
                    if (ch[i] == '(') {
                        st.add(ch[i]);
                    } else {
                        if (!st.isEmpty() && st.peek() == '(') {
                            st.pop();
                        } else {
                            answer = false;
                            break;
                        }
                    }
                }
                if (!st.isEmpty()) {
                    answer = false;
                }

                return answer;
            }
        }
        */

        // [📝관련문제] 프로그래머스 - 같은 숫자는 싫어
        // https://school.programmers.co.kr/learn/courses/30/lessons/12906
        /*
        import java.util.*;
        public class Solution {
            public int[] solution(int []arr) {
                Stack<Integer> st = new Stack<>();

                for (int i = 0; i < arr.length; i++) {
                    if(st.isEmpty() || st.peek()!=arr[i]){
                        st.add(arr[i]);
                    }
                }

                int[] answer = new int[st.size()];
                for(int i = answer.length - 1; i >= 0; i--) {
                    answer[i] = st.pop();
                }

                return answer;
            }
        }
        */

        ///* ************ Deque ************ *///
        // 양방향 큐(Double Ended Queue)를 의미하며, 양쪽 끝에서 모두 요소의 추가와 삭제가 가능한 자료 구조
        // 큐/스택보다 성능도 유의미한 수준으로 우수함
//        Deque<Integer> dq = new ArrayDeque<>();

        ///* ************ Deque의 주요 메서드 ************ *///
        //📍.addFirst()
        //📍.addLast()
//        dq.addLast(10);
//        dq.addLast(20);
//        dq.addFirst(30);
//        System.out.println(dq); // [30, 10, 20]
        //📍.pollFirst()
        //📍.pollLast()
//        System.out.println(dq.pollLast()); // 20
//        System.out.println(dq.pollFirst()); // 30
        //📍.peekFirst()
        //📍.peekLast()
//
    }
}
