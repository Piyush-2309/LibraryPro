package org.patil.library_management_system.Controller;

import org.patil.library_management_system.Entity.Category;
import org.patil.library_management_system.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("category")
@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getCategoryDetails()
    {
        return categoryService.getCategoryDetails();
    }

    @GetMapping("/id/{id}")
    public Optional<Category> getCategoryById(@PathVariable long id)
    {
        return categoryService.getCategoryById(id);
    }

    @PostMapping
    public void addCategory(@RequestBody Category category)
    {
        categoryService.addCategory(category);
    }

    @PutMapping("/id/{id}")
    public void updateCategory(@RequestBody Category category, @PathVariable long id)
    {
        categoryService.updateCategory(category, id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteCategory(@PathVariable long id)
    {
        categoryService.deleteCategory(id);
    }


}
