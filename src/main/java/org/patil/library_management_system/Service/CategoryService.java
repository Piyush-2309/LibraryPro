package org.patil.library_management_system.Service;

import org.patil.library_management_system.Entity.Author;
import org.patil.library_management_system.Entity.Category;
import org.patil.library_management_system.Repository.AuthorRepository;
import org.patil.library_management_system.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getCategoryDetails()
    {
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(long id)
    {
        return categoryRepository.findById(id);
    }

    public void addCategory(Category category)
    {
        categoryRepository.save(category);
    }

    public void updateCategory(Category category, long id)
    {
        Optional<Category> oldCategory = categoryRepository.findById(id);
        if(oldCategory.isPresent())
        {
            Category previousCategory = oldCategory.get();
            previousCategory.setCategoryName(category.getCategoryName());
            previousCategory.setDescription(category.getDescription());
        }
    }

    public void deleteCategory(long id)
    {
        categoryRepository.deleteById(id);
    }
}
