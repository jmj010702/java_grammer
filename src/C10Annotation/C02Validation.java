package C10Annotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


// 어노테이션은 선언적 표시이고, 어떠한 기능도 수행하지 않음
//아래 NotEmpty어노테이션 클래스는 어떤 기능도 없지만, 특정 필드값이 비어있으면 안된다는 선언적표시.
// 리플렉션은 시본적으로 런타임에 동작하므로, 어노테이션을 사용할 떄에 기본적으로 런타임 동작 설정
@Retention(RetentionPolicy.RUNTIME)
@interface NotEmpty {
    //    어노테이션 클래스의 속성은 일반적으로 메서드 형태로 정의
    String message() default "this field cannot be empty!!";
}

public class C02Validation {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        List<Member> memberList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("회원가입 서비스입니다");
            System.out.println("이름을 입력해주세요");
            String name = br.readLine();
            System.out.println("이메일을 입력해주세요");
            @NotEmpty
            String email = br.readLine();
            Member member = new Member(name, email);
//           추후 스프링에서는 아래와 같은 "validate메서드  + 직접만든 어노테이션이 모두 합쳐져 있는 이미 만들어진 어노테이션 사용
            Validate(member);
            memberList.add(member);
        }


    }

    //    특정 변수에 NotEmpty 어노테이션 설정이 있을경우, 값이 비어있는지를 검사하는 메서드.
    static void Validate(Object object) throws IllegalAccessException {
//        리플랙션 기술을 통해 런타임 시점에 객체 안의 프라이빗이라도 필드값을 꺼내 확인할 수 있음
        Field[] fieldlist = object.getClass().getDeclaredFields();
        for (Field f : fieldlist) {
            if (f.isAnnotationPresent(NotEmpty.class)) {
                f.setAccessible(true);
                String value = (String) f.get(object);
                if (value == null || value.isEmpty()) {
                    NotEmpty n1 = f.getAnnotation(NotEmpty.class);
                    throw new IllegalArgumentException(n1.message());
                }
            }
        }
    }
}

class Member {

    private String name;
    @NotEmpty
    private String email;

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }


}
