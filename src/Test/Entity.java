package Test;

public class Entity {
    private static Long sta_id;
    private Long id;
    private String name;
    private String email;
    private String pw;

    public Entity(String name, String email, String pw) {
        sta_id ++;
        this.id = sta_id;
        this.name = name;
        this.email = email;
        this.pw = pw;
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
