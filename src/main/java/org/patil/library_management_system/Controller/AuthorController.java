package org.patil.library_management_system.Controller;

import org.patil.library_management_system.Entity.Author;
import org.patil.library_management_system.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("author")
@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> getAuthorDetails()
    {
        return authorService.getAuthorDetails();
    }

    @GetMapping("/id/{id}")
    public Optional<Author> getAuthorById(@PathVariable long id)
    {
        return authorService.getAuthorById(id);
    }

    @PostMapping
    public void addAuthor(@RequestBody Author author)
    {
        authorService.addAuthor(author);
    }

    @PutMapping("/id/{id}")
    public void updateAuthor(@PathVariable long id, @RequestBody Author author)
    {
        authorService.updateAuthor(id, author);
    }

    @DeleteMapping("/id/{id}")
    public void deleteAuthor(@PathVariable long id)
    {
        authorService.deleteAuthor(id);
    }

}
