package C06ETCClass;

import java.io.IOException;

public class C03EnumMain {
    public static void main(String[] args) throws IOException {
//        grade룰 일반문자열로 설게했을 경우 -> 데이터 종류에 대한 통제가 불가능하다.
//        Student s1 = new Student("h1","f_grade");
//        Student s2 = new Student("h1","ff_grade");
//        Student s3 = new Student("h1","1학년");

//        static final 변수로 설계했을 경우
//        Student s1 = new Student("h1",Classgrade.c1);
//        Student s2 = new Student("h1",Classgrade.c2);
//        Student s3 = new Student("h1","1학년");


//       grade를 Enum클래스로 설계했을 경우
        Student s1 = new Student("h1",ClassGrade.f_grade);
        Student s2 = new Student("h1",ClassGrade.s_grade);
        Student s3 = new Student("h1",ClassGrade.t_grade);


        System.out.println(s1);
    }
}

//  ENUM클래스는 데이터의 종류를 하나의 Enum명아래 묶는 것
enum ClassGrade {
//    Enum의 변수값은 static final변수처럼 사용
    f_grade,s_grade,t_grade;
        }

//class Classgrade {
//    static final String c1 = "f-grade";
//    static final String c2 = "s-grade";
//    static final String c3 = "t-grade";
//}
class Student{
    private String name;
//    private String grade; // 학년 : f_grade,s_grade,t_grade
    private ClassGrade classGrade;
    public Student(String name, ClassGrade classGrade) {
        this.classGrade = classGrade;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", classGrade='" + classGrade + '\'' +
                '}';
    }
}