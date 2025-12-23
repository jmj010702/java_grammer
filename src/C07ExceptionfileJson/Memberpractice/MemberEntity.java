package C07ExceptionfileJson.Memberpractice;

public class MemberEntity {
    private static Long sta_id = 0L;
    private Long id;
    private String name;
    private String email;
    private String pw;

    public MemberEntity(String name, String pw, String email) {
      sta_id++;
       this.id = sta_id;
        this.pw = pw;
        this.email = email;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
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
}
