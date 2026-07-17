package org.patil.library_management_system.Controller;

import org.patil.library_management_system.Entity.Member;
import org.patil.library_management_system.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("member")
@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public List<Member> getMemberDetails()
    {
        return memberService.getMemberDetails();
    }

    @GetMapping("/id/{id}")
    public Optional<Member> getMemberById(@PathVariable long id)
    {
        return memberService.getMemberById(id);
    }

    @PostMapping
    public void addMember(Member member)
    {
        memberService.addMember(member);
    }


}
