package kr.co.mid.member;

import org.springframework.stereotype.Service;

@Service
public interface memberService {
    int member_join(MemberVO vo);
    int member_idcheck(String user_id);
    MemberVO memberlogin(MemberVO vo);

    int member_update();
    void find_password(MemberVO vo);

}
