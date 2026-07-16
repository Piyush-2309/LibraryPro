package org.patil.library_management_system.Repository;

import org.patil.library_management_system.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
