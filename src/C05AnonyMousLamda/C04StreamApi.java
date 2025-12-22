package C05AnonyMousLamda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C04StreamApi {
    public static void main(String[] args) throws IOException {
        int[] arr = {20, 10, 4, 12};
//        전통적인 방식의 데이터 접근 방법 : 메모리 접근
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
        }
//        힘수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌,
//        입력에 따른 출력(연산작업포함)만 존재하는 코딩스타일
//        streamApi : java에서 함수형 프로그래밍을 지원하는 라이브러리
//        foreach 는 스트림의 각 요소를 하나씩 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a -> System.out.println(a));

//      스트림의 생성 : .stream()
        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("C++");
        list1.add("python");
        Stream<String> st1 = list1.stream();
        String[] strarrr = {"java", "C++", "python"};
//        Stream<String > st2 = Arrays.stream(st1);

//        원시자료형을 위한 Stream객체가 별도로 존재
        int[] intarr = {10, 20, 30, 40, 50};
        Arrays.sort(intarr);
//        IntStream stream3 = Arrays.stream(intarr);

//        stream의 중개연산(변환) : filter,sorted,distinct,mapTointl

        int[] arr1 = {10, 10, 30, 40, 50};
//        filter : 특정 기준으로 대상을 필터링하요 새로운 스트림을 반환하는 중계연산
//        sum : 스트림의 요소를 하나씩 소모하여 총합을 구하는 메서드
        int total = Arrays.stream(arr).filter(a -> a >= 30).sum();
//        System.out.println(total);

// map : 기존의 스트림을 조작하여 새로운 스트림을 반환
        int total2 = Arrays.stream(arr1).map(a -> a * a).sum();
//        System.out.println(total2);

//      distinct : 중복제거
        int total3 = Arrays.stream(arr1).distinct().sum();
//        System.out.println(total3);

//        sorted : 정렬
        int[] sortedarr = Arrays.stream(arr1).sorted().toArray();
//        System.out.println(Arrays.toString(sortedarr));

//        maptoint : intstream형태로 변환해주는 map
        String[] strarr = {"java", "python", "c++"};
        int totallength = Arrays.stream(strarr).mapToInt(a -> a.length()).sum();
//        System.out.println(totallength);

        int[] arr2 = {1, 2, 3, 4, 5, 6};
//        실습1 . arr에서 홀수만 담은 배열을 생성 후 배열 출력 filter
        int[] ttotal1 = Arrays.stream(arr2).filter(a -> a % 2 != 0).toArray();
//        System.out.println(Arrays.toString(ttotal1));
//        실습2 : arr에서 홀수만 걸러서 해당 홀수의 제곱값을 담은 배열을 출력 filter.map
        int[] ttotal2 = Arrays.stream(arr2).filter(a -> a % 2 != 0).map(a -> a * a).toArray();
//        System.out.println(Arrays.toString(ttotal2));
//        실습3 : arr에서 홀수만 걸로 제곱값을 구하고, 해당 숫자값을 오름차순한 순서로 배열을 출력 filter.map.sorted
        int[] ttotal3 = Arrays.stream(arr2).filter(a -> a % 2 != 0).map(a -> a * a).sorted().toArray();
//        System.out.println(Arrays.toString(ttotal3));

//        stram의 소모, foreach출력),(sum(합계),max,min, count , reduce, findfirst
        int[] arr3 = {10, 20, 30, 40};
//        Arrays.stream(arr3).forEach(a-> System.out.println(a));
        int total5 = Arrays.stream(arr3).sum();
        long count = Arrays.stream(arr3).count();
//        System.out.println(total5+ " " + count);
//        optional 객체: 값이 있을 수도 있고, 없을수도 있음을 명시한 객체 .
        int max = Arrays.stream(arr3).max().getAsInt();
        int min = Arrays.stream(arr3).min().getAsInt();

//        reduce : 누적연산 -> reduce(초기값, 연산식)
        int[] arr4 = {10, 20, 30, 40};

        int accsum = Arrays.stream(arr4).reduce(0, (a, b) -> a + b);
        int accmulti = Arrays.stream(arr4).reduce(1, (a, b) -> a * b);
        String[] strarr1 = {"java", "python", "c++"};
        String result = Arrays.stream(strarr1).reduce("", (a, b) -> a + b);
//        System.out.println(result);

//        findfirst : 첫번째 요소 반환
        String firstval = Arrays.stream(strarr1).filter(a -> a.length() >= 5).findFirst().get();
//        System.out.println(firstval);
        Map<String, Integer> map = new HashMap<>();
        map.put("hello", 10);
        map.put("java", 10);
        String keyval = map.keySet().stream().findFirst().get();
//        System.out.println(keyval);

//      배열로 변환시 주의사항 : 제네릭에 타입소거 ->  자바의 런타입시점에 <STring>과 같은 제네릭의 타입이 제거되는 현상
//        제네릭의 타입소거로 인해, toArray를 통해 새로운 String배열을 곧바로 만들어내는 것은 불가
        String[] starr = {"hello", "java", "world"};
        String[] answer = Arrays.stream(starr).filter(a -> a.length() >= 5).toArray(a -> new String[a]); //a안에는 배열의 길이가 담김

//        메소드 참조 : 하나의 메소드만을 호츌하는 경우에 매개변수를 제거한 방식
//        형식 - "클래스명 :: 메서드명", 조건 -하나의 메서드(실행문)만을 호출하는 경우
//        Arrays.stream(starr).forEach(a -> System.out.println(a));
//        Arrays.stream(starr).forEach(System.out::println);
        String[] answer2 = Arrays.stream(starr).filter(a -> a.length() >= 5).toArray(String[]::new);

        List<student> list = new ArrayList<>();
        list.add(new student("kim", 23));
        list.add(new student("choi", 30));
        list.add(new student("lee", 24));
        list.add(new student("park", 21));
//      모든 객체의 평균나이( average) 함수
        double average = list.stream().mapToInt(a -> a.getAge()).average().getAsDouble();
//       정렬을 통한 가장 나이 어린 사람찾기 (sorted,findfirst);
        student s1 = list.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).findFirst().get();
//        30대인 사람들만의 이름을 모아서 새로운 String배영에 담기 (map활용 )
        String[] arr5 = list.stream().filter(a -> a.getAge() >= 30).map(a -> a.getName()).toArray(a -> new String[a]);

//        optinal 객체 : 특정개체에 값이 없을지도(null) 모른다는 것을 명시적으로 표현한 객체
        String st2 = null;
        if (st2 == null) {
//            System.out.println("값이 없습닏");
        } else {
//            System.out.println("값이 있습닏");
        }

//     optional 객체생성 방법 3가지
        Optional<String> opt1 = Optional.empty(); // 비어있는 optional객체 생성
        Optional<String> opt2_1 = Optional.ofNullable(null); // 비어있는 optional 객체 생성
        Optional<String> opt2_2 = Optional.ofNullable("hello"); //값이 있는 optional객체 생성
        Optional<String> opt3 = Optional.of("hello"); //값이 있는 optional객체 생성

//        optional객체 처리 방법 4가지
//        방법1 ispresent()로 확인 후에 get()
        if (opt1.isPresent()) {
//            System.out.println(opt1.get());
        } else {
//            System.out.println("값이 없습니다");
        }

//        방법 2 : orElse :값이 있으면 있는 값 리턴  없으면  지정된 값 리턴
//        System.out.println(opt2_1.orElse("값이 없습니다 "));
//        System.out.println(opt2_2.orElse("값이 없습니다 "));

//        방법 3 : orElseGet : 값이 있으면 있는 값 리턴 없으면 람다함수 실행
//        System.out.println(opt2_1.orElseGet(() -> new String("값이 없습니다")));
//
//        방법 4 : orElsethrow  - 가장 많이 사용 : 값이 있으면 있는 값 리턴 , 없으면 지정한 예외(에러) 강제발생
//        웹 개발에서 값을 입력하는 사용자에게 적절한 메시지 전달 목적과 의도된 코드중단을 목표로 강제로 예외(에러)를 발생시키는 경우는 매우 일반적
//        System.out.println(opt2_1.orElseThrow(()->new RuntimeException("값이 없습니다")));
//        System.out.println(opt2_1.orElseThrow(()->new NoSuchElementException("값이 없습니다")));
//        System.out.println(opt2_1.get()); //의도치 않은 에러발생. (지양해야 할 에러)

//        optional객체 처리 실습 1
        List<student> list3 = new ArrayList<>();
        list3.add(new student("kim", 23));
        list3.add(new student("choi", 30));
        list3.add(new student("lee", 24));
        list3.add(new student("park", 21));

        //    optional객체 처리방법 1
        OptionalDouble optionlavg = OptionalDouble.of(list3.stream().mapToInt(a -> a.getAge()).average().getAsDouble());
        if (optionlavg.isPresent()) {
            double value = optionlavg.getAsDouble();
//            System.out.println(value);
        } else {
//            System.out.println("값이 없습");
        }
//        optional객체 처리방법 2
        OptionalDouble value2 = OptionalDouble.of(list3.stream().mapToInt(a -> a.getAge()).average().orElseThrow(() -> new NoSuchElementException("값이 없습니다.")));
//        System.out.println(value2);

//        optional객체 처리 실습 2
        System.out.println("조회하고싶은 student의 인덱스 번호를 입력해주세요 ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
Optional<student> s2;
        if (list3.size() <= number || number < 0) {
            s2 = Optional.empty();
        } else {
            s2 = Optional.of(list3.get(number));
        }
        System.out.println(s2.orElseThrow(() -> new NoSuchElementException("없는 회원입니다.")));



    }
}