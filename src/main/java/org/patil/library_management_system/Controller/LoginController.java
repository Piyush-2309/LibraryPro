package org.patil.library_management_system.Controller;

import org.patil.library_management_system.Entity.Admin;
import org.patil.library_management_system.Entity.Librarian;
import org.patil.library_management_system.Entity.Member;
import org.patil.library_management_system.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("Login")
@RestController
public class LoginController
{
    @Autowired
    private LoginService loginService;

    @PutMapping("/admin")
    public boolean adminLogin(@RequestBody Admin admin)
    {
        return loginService.adminLogin(admin);
    }

    @PutMapping("/librarian")
    public boolean librarianLogin(@RequestBody Librarian librarian)
    {
        return loginService.librarianLogin(librarian);
    }

    @PutMapping("/member")
    public boolean memberLogin(@RequestBody Member member)
    {
        return loginService.memberLogin(member);
    }

}
