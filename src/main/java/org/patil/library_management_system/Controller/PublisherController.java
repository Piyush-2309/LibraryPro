package org.patil.library_management_system.Controller;

import org.patil.library_management_system.Entity.Publisher;
import org.patil.library_management_system.Service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("publisher")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @GetMapping
    public List<Publisher> getPublisherDetails()
    {
        return publisherService.getPublisherDetails();
    }

    @GetMapping("/id/{id}")
    public Optional<Publisher> getPublisherById(@PathVariable long id)
    {
        return publisherService.getPublisherById(id);
    }

    @PostMapping
    public void addPublisher(@RequestBody Publisher publisher)
    {
        publisherService.addPublisher(publisher);
    }

    @PutMapping("/is/{id}")
    public void updatePublisher(@RequestBody Publisher publisher, @PathVariable long id)
    {
        publisherService.updatePublisher(publisher, id);
    }

    @DeleteMapping("/id/{id}")
    public void deletePublisher(@PathVariable long id)
    {
        publisherService.deletePublisher(id);
    }
}
