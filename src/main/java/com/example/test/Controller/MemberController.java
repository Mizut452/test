package com.example.test.Controller;

import com.example.test.Model.Entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

    @RequestMapping("/member")
    public String memberPage(Model model,
                             Member member) {


        model.addAttribute("MemberName", member.getMemberName());

        return "memberPage";
    }
}
