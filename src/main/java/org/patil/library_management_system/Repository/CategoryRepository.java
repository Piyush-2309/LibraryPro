package org.patil.library_management_system.Repository;

import org.patil.library_management_system.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
