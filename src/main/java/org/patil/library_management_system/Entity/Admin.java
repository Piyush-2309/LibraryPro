package org.patil.library_management_system.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="admin")
public class Admin {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long admin_id;

    private String admin_name;

    private String admin_password;

    public Admin(long admin_id, String admin_email, String admin_password, String admin_name) {
        this.admin_id = admin_id;
        this.admin_email = admin_email;
        this.admin_password = admin_password;
        this.admin_name = admin_name;
    }

    private String admin_email;
}
