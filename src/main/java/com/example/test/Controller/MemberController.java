package com.example.test.Controller;

import com.example.test.Mapper.MemberMapper;
import com.example.test.Model.Entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    MemberMapper memberMapper;

    @RequestMapping("/member")
    public String memberPage(Model model) {
        Member member = memberMapper.selectByMemberId(1);

        model.addAttribute("MemberName", member.getMemberName());

        return "Member";
    }

    @GetMapping("/member/yaro")
    public String memberPage2(Model model) {
        Member member = memberMapper.selectByMemberId(2);
        model.addAttribute("member", member);

        return "mandi";
    }
}
