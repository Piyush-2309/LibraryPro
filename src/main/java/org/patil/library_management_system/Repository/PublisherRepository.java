package org.patil.library_management_system.Repository;

import org.patil.library_management_system.Entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
