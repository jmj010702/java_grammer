package C06ETCClass;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class C02Calender {
    public static void main(String[] args) throws IOException {
//        java.util 패키지의 Calendar 클래스
//        Calendar mycal = Calendar.getInstance(); //오른쪽 인스턴스에서 새 객체를 만들어줌
//        System.out.println(mycal.getTime());
//        System.out.println(mycal.get(Calendar.YEAR));
//        System.out.println(mycal.get(Calendar.MONTH)+1);
//        System.out.println(mycal.get(Calendar.DAY_OF_WEEK)); //요일
//        System.out.println(mycal.get(Calendar.DAY_OF_MONTH)); // 일
//        System.out.println(mycal.get(Calendar.HOUR));
//        System.out.println(mycal.get(Calendar.MINUTE));
//        System.out.println(mycal.get(Calendar.SECOND));

//        java.time 패키지의 LocalDatetime, LocalDate, Localtime 클래스
//        LocalDate myld = LocalDate.now();
//        System.out.println(myld);
//        System.out.println(myld.getYear());
//        System.out.println(myld.getMonth());
//        System.out.println(myld.getMonthValue());
//        System.out.println(myld.getDayOfMonth());
//        System.out.println(myld.getDayOfWeek());
//
        LocalTime mylt = LocalTime.now();
//        System.out.println(mylt.getHour());
//        System.out.println(mylt.getMinute());
//        System.out.println(mylt.getSecond());

        LocalDateTime myldt = LocalDateTime.now();
//        System.out.println(myldt.getYear());
//        System.out.println(myldt.getHour());
//        crono field 매개변수로 다양한 형식의 날짜/시간 정보 조회
//        System.out.println(myldt.get(ChronoField.YEAR));
//        System.out.println(myldt.get(ChronoField.MONTH_OF_YEAR));
//        System.out.println(myldt.get(ChronoField.AMPM_OF_DAY)); // 0이면 오전 1이면 오후
//        System.out.println(myldt.get(ChronoField.CLOCK_HOUR_OF_DAY)); //24시 체계로 출력

//        .of : 임의로 특정시간정보 객체를 만들어내고 싶을 때 사용
        LocalDate birthday = LocalDate.of(2001,7,2);
        System.out.println(birthday);
        LocalDateTime birthtime = LocalDateTime.of(2001, 7, 2,05,30);
        System.out.println(birthtime); //날짜와 시간 사이에 T가 들어감

    }
}
