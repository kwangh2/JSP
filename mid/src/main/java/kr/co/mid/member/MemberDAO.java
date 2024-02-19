package kr.co.mid.member;

import com.example.demo.common.MybatisConnection;

public class MemberDAO extends MybatisConnection implements memberService{
    public MemberDAO(){
        super(MybatisConnection.DataResource.HANUL);
    }
    @Override
    public int member_join(MemberVO vo) {
        return sql.insert("me.insert",vo);
    }

    @Override
    public int member_idcheck(String user_id) {
        return 0;
    }

    @Override
    public MemberVO memberlogin(MemberVO vo) {
        return null;
    }

    @Override
    public int member_update() {
        return 0;
    }

    @Override
    public void find_password(MemberVO vo) {

    }
}
