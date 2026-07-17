package org.patil.library_management_system.Service;

import org.patil.library_management_system.Entity.Admin;
import org.patil.library_management_system.Entity.Librarian;
import org.patil.library_management_system.Entity.Member;
import org.patil.library_management_system.Repository.AdminRepository;
import org.patil.library_management_system.Repository.LibrarianRepository;
import org.patil.library_management_system.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class LoginService
{
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private LibrarianRepository librarianRepository;

    @Autowired
    private MemberRepository memberRepository;

    public boolean adminLogin(Admin admin)
    {
        Optional<Admin> oldAdmin = adminRepository.findByAdminEmail(admin.getAdmin_email());
        if(oldAdmin.isPresent())
        {
            Admin previousAdmin = oldAdmin.get();
            return Objects.equals(previousAdmin.getAdmin_password(), admin.getAdmin_password());
        }
        return false;
    }

    public boolean librarianLogin(Librarian librarian)
    {
        Optional<Librarian> oldLibrarian = librarianRepository.findByLibrarianEmail(librarian.getLibrarian_email());
        if(oldLibrarian.isPresent())
        {
            Librarian previousLibrarian = oldLibrarian.get();
            return Objects.equals(previousLibrarian.getLibrarian_password(), librarian.getLibrarian_password());
        }
        return false;
    }

    public boolean memberLogin(Member member)
    {
        Optional<Member> oldMember = memberRepository.findByMemberEmail(member.getMemberPassword());
        if(oldMember.isPresent())
        {
            Member previousMember = oldMember.get();
            return Objects.equals(previousMember.getMemberPassword(), member.getMemberPassword());
        }
        return false;
    }


}
