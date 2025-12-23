package C07ExceptionfileJson.Memberpractice;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MemberRepository {

//    값 저장할 리스트 , 생성자 , 값을 넣어줄 메서드
    private List<MemberEntity> memberlist;

    public MemberRepository() {
        this.memberlist = new ArrayList<>();
    }

    public void register(MemberEntity member) {
        this.memberlist.add(member);
    }
//    email

    public Optional<MemberEntity> findByEmail(String email) {
        for(MemberEntity m : memberlist) {
            if(m.getEmail().equals(email)) {
                return Optional.of(m);
            }
        }
        return Optional.empty();
    }

//    id
public Optional<MemberEntity> findById(long id) {
    for(MemberEntity  m : memberlist) {
        if (m.getId() == id) {
            return Optional.of(m);
        }
    }
    return Optional.empty();
}

//    전체 목록 조회
    public List<MemberEntity> findAll() {
        return this.memberlist;
    }

}
