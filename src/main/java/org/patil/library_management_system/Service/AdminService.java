package org.patil.library_management_system.Service;

import org.patil.library_management_system.Entity.Author;
import org.patil.library_management_system.Entity.Book;
import org.patil.library_management_system.Entity.Librarian;
import org.patil.library_management_system.Entity.Publisher;
import org.patil.library_management_system.Repository.AuthorRepository;
import org.patil.library_management_system.Repository.BookRepository;
import org.patil.library_management_system.Repository.LibrarianRepository;
import org.patil.library_management_system.Repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private LibrarianRepository librarianRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    @Autowired
    private BookRepository bookRepository;

    public void addLibrarian(Librarian librarian)
    {
        librarianRepository.save(librarian);
    }

    public void addAuthor(Author author)
    {
        authorRepository.save(author);
    }

    public void addPublisher(Publisher publisher)
    {
        publisherRepository.save(publisher);
    }

    public void addBook(Book book)
    {
        bookRepository.save(book);
    }

}
