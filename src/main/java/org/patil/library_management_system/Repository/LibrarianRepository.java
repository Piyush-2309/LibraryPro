package org.patil.library_management_system.Repository;

import org.patil.library_management_system.Entity.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrarianRepository extends JpaRepository<Librarian, Long> {
}
