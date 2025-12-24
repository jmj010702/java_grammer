package C07ExceptionfileJson.MemberException;

import java.util.NoSuchElementException;/*

import java.util.List;
import java.util.Optional;

//핵심로직을 구현하는 계층
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService() {
        memberRepository = new MemberRepository();
    }

    public void register(String name, String email, String password) {
//        List(DB)에 이메일이 중복일경우 예외발생
        if (memberRepository.findByEmail(email).isPresent()) {
            throw new IllegalArgumentException("이미 사용중인 이메일 입니다.");
        }
//        객체 조립 후 repository를 통해 저장
        Member newMember = new Member(name, email, password);
        memberRepository.register(newMember);
    }

//  메서드 상단부에 예외를 넣어주는게 관례
    public Member findById(long id)throws NoSuchElementException {
        //            예외 발생
        return memberRepository.findById(id).orElseThrow(() -> new NoSuchElementException("id가 없습니다."));
    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public void login(String email, String password) throws NoSuchElementException, IllegalArgumentException {
//        email이 있는지 확인 후 없으면 예외발생
        Member member = memberRepository.findByEmail(email).orElseThrow(() -> new NoSuchElementException("이메일이 없습니다"));
//        password가 일치한지 확인 후 일치하지 않으면 예외 발생
        if (!member.getPw().equals(password)) {
            throw new IllegalArgumentException("비밀번호가 맞지 않습니다. ");
        }
    }
}
*/