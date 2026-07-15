package org.patil.library_management_system.Service;

import org.patil.library_management_system.Entity.Book;
import org.patil.library_management_system.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBookDetails()
    {
        return bookRepository.findAll(Sort.by("book_price"));
    }

}
