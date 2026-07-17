package org.patil.library_management_system.Service;

import org.aspectj.apache.bcel.classfile.Module;
import org.patil.library_management_system.Entity.Author;
import org.patil.library_management_system.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAuthorDetails()
    {
        return authorRepository.findAll();
    }

    public Optional<Author> getAuthorById(long id)
    {
        return authorRepository.findById(id);
    }

    public void addAuthor(Author author)
    {
        authorRepository.save(author);
    }

    public void updateAuthor(long id, Author author)
    {
        Optional<Author> oldAuthor = authorRepository.findById(id);
        oldAuthor.ifPresent(previousAuthor -> previousAuthor.setAuthor_name(author.getAuthor_name()));
    }

    public void deleteAuthor(long id)
    {
        authorRepository.deleteById(id);
    }
}
