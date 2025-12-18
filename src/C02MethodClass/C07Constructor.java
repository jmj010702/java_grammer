package C02MethodClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*
public class C07Constructor {
    public static void main(String[] args) throws IOException {
//    캘린더 객체 생성
        Calender cal = new Calender("2025","12","16" );
//        toString이 자동 호출됨
        System.out.println(cal);

//        java 자료구조내에 직접 만든 객체를 담아 관리
        List<Calender> list = new ArrayList<>();
//        list안에는 calender 객체 주소가 들어가있음
        list.add(cal);
        list.add(new Calender("2025", "12", "16"));
//        원래 같으면 힘메모리 주소값이 출력이되야 하지만 tostring을 오버라이드 했기 때문에 자동 호출되어  tostring형태로 호출
        System.out.println(list);


    }

}

class Calender {
    private String year;
    private String month;
    private String day;

//        생성자 : 객체가 만들어지는(new) 시점에 호출되는 메서드
//        생성자 특징
//        1. 클래스명과 메서드명이 동일
//        2. 반환타입이 없음 (void x)
//        3. 매개변수 X

//        생성자의 사용목적 : 객체 생성시점에 객체변수값들을 초기화(세팅). 변수의 안정성을 위해 setter의 사용을 지양하고, 생성자를 사용
    public Calender(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

//      직접 생성자를 1개라도 추가할 경우(초기(기본)생성자는 무시가 되므로, 필요시 별도로 추가해야함
    public Calender() {
    }

    public String returnInfo() {
        return this.year + "년 " + this.month + "월 " + this.day + "일 ";
    }

//    toString메서드는 객체명으로 출력시 자동으로 메서드가 호출
    @Override
    public String toString() {
        return "{" +
                "year '" + year + '\'' +
                ", month '" + month + '\'' +
                ", day '" + day + '\'' +
                '}';
    }
}
/*
// 클래스명 {
변수 1;
변수 2;
생성자() {
}
getter
}
*/