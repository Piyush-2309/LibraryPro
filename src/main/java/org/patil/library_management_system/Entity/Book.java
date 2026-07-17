package org.patil.library_management_system.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long book_id;

    private String book_name;

    private long book_price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
