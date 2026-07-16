package org.patil.library_management_system.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long publisher_id;

    private String publisher_name;

    private String publisher_email;

    private String publisher_phone;

    private String publisher_address;

    public Publisher(long publisher_id, String publisher_name, String publisher_email,
                     String publisher_phone, String publisher_address) {
        this.publisher_id = publisher_id;
        this.publisher_name = publisher_name;
        this.publisher_email = publisher_email;
        this.publisher_phone = publisher_phone;
        this.publisher_address = publisher_address;
    }
}