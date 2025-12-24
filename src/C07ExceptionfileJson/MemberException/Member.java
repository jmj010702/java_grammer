package C07ExceptionfileJson.MemberException;
/*
//코드를 나눠서 작성한 이유
// 1. 코드의 책임
// Controller : 사용자와 인터페이스
//Service : 핵심 로직, 비즈니스 로직
//Repository : 저장소 (DB) 의 CRUD하는 코드
//Entity : 클래스 객체
// 2.  예외 처리
//Service에서 에러를 터트림(트랜잭션에서 롤백처리하기 위해서) -> Controller에서 예외처리를 하여 사용자에게 메시지 전달
//3. Optional 객체의 효용 -> null처리의 실수 방지


//객체 - 엔티티
 class Member {
    private static Long sta_id = 0L;
    private Long id;
    private String name;
    private String email;
    private String pw;

    public Member(String name, String email, String pw) {
        sta_id++;
        this.id = sta_id;
        this.name = name;
        this.email = email;
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
} */