package C07ExceptionfileJson.Memberpractice;

import java.lang.reflect.Member;
import java.util.NoSuchElementException;
import java.util.Optional;

public class MemberService {
    private MemberRepository memberRepository;

//생성자 생성 -> MemberServic 생성자가 호출될때 Reposiory 객체도 한번에 생성
    public MemberService() {
       memberRepository = new MemberRepository();
    }

//    회원가입할 때 email이 중복이라면 가입 안되게 하고 아니라면 객체를 조립해서 회원가입하는 코드
    public void Register(String  name, String email, String pw) {
        if(memberRepository.findByEmail(email).isPresent()) {
            throw new IllegalArgumentException("이미 있는 email입니다.");
        }
        MemberEntity newmember = new MemberEntity(name, pw, email);
        memberRepository.register(newmember);
    }
//    ID를 찾는 메서드
    public Member findById(long id)  {
return memberRepository.findById(id).orElseThrow( () -> new NoSuchElementException("ID가 없습니다"));
    }

//    findAll 메서드

    public List<MemberEntity> findAll() {
        return memberRepository.findAll();
    }

//    login 메서드 email이 있는지 확인후 에외발생 / 비밀번호도 확인
}
