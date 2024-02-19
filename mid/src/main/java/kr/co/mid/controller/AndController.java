package kr.co.mid.controller;

import com.example.demo.member.MemberVO;
import com.example.demo.member.memberService;
import jakarta.servlet.http.HttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AndController extends HttpServlet {
    @Autowired
    private memberService service;

    @RequestMapping("test")
    public String conntest(){
        System.out.println("외않됨");
        return "index";
    }


    @ResponseBody
    @RequestMapping("/join.and")
    public void join(MemberVO vo){
       service.member_join(vo);
    }

    @RequestMapping("*.and")
    public void test(){
        System.out.println("접속은 됬누 ㅠㅠ");
    }
}
