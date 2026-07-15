package org.patil.library_management_system.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Author {

    private String author_name;

    private long author_id;

    @ManyToMany(mappedBy = "authorList")
    private List<Book> books;
}
