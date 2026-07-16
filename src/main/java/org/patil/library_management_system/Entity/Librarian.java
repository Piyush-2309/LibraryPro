package org.patil.library_management_system.Entity;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Librarian {

    private long librarian_id;

    private String librarian_name;

    private String librarian_password;

    public Librarian(long librarian_id, String librarian_email, String librarian_password, String librarian_name) {
        this.librarian_id = librarian_id;
        this.librarian_email = librarian_email;
        this.librarian_password = librarian_password;
        this.librarian_name = librarian_name;
    }

    private String librarian_email;
}
