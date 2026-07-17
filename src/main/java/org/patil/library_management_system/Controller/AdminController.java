package org.patil.library_management_system.Controller;


import org.patil.library_management_system.Entity.Author;
import org.patil.library_management_system.Entity.Book;
import org.patil.library_management_system.Entity.Librarian;
import org.patil.library_management_system.Entity.Publisher;
import org.patil.library_management_system.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("addLibrarian")
    public void addLibrarian(@RequestBody Librarian librarian)
    {
        adminService.addLibrarian(librarian);
    }

    @PostMapping("addAuthor")
    public void addAuthor(@RequestBody Author author)
    {
        adminService.addAuthor(author);
    }

    @PostMapping("addPublisher")
    public void addPublisher(@RequestBody Publisher publisher)
    {
        adminService.addPublisher(publisher);
    }

    @PostMapping("addBook")
    public void addBook(@RequestBody Book book)
    {
        adminService.addBook(book);
    }
}
