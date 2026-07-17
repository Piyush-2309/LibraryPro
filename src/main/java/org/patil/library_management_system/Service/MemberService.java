package org.patil.library_management_system.Service;

import org.patil.library_management_system.Entity.Member;
import org.patil.library_management_system.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getMemberDetails()
    {
        return memberRepository.findAll();
    }

    public Optional<Member> getMemberById(long id)
    {
        return memberRepository.findById(id);
    }

    public void addMember(Member member)
    {
        memberRepository.save(member);
    }
}
