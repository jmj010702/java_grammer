package C03Inheritance;

//class에는 public. default 접근 제어자만 존재

public class C04ProtectedClass {
//    변수, 메서드에는 4가지 접근 제어자가 존재
//    public : 프로젝트 전체에서 접근 가능(다른 패키지에서도 접근 가능)
//    protected : 같은 페키지는 물론이고 다른 패키지이더라도 상속관계인 경우에는 접근 가능
//    default : 같은 패키지내에서만 접근 가능
//    private : 클래스 내에서만 접근 가능

    public String st1 = "hello java1";
    protected String st2 = "hello java3";
    String st3 = "hello java3";
    private String st4 = "hello java4";



}
