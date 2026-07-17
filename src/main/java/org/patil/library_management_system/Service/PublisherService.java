package org.patil.library_management_system.Service;


import org.patil.library_management_system.Entity.Category;
import org.patil.library_management_system.Entity.Publisher;
import org.patil.library_management_system.Repository.PublisherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublisherService {

    private PublisherRepository publisherRepository;

    public List<Publisher> getPublisherDetails()
    {
        return publisherRepository.findAll();
    }

    public Optional<Publisher> getPublisherById(long id)
    {
        return publisherRepository.findById(id);
    }

    public void addPublisher(Publisher publisher)
    {
        publisherRepository.save(publisher);
    }

    public void updatePublisher(Publisher publisher, long id) {
        Optional<Publisher> oldPublisher = publisherRepository.findById(id);
        if (oldPublisher.isPresent()) {
            Publisher previousPublisher = oldPublisher.get();
            previousPublisher.setPublisher_name(publisher.getPublisher_name());
            previousPublisher.setPublisher_address(publisher.getPublisher_address());
            previousPublisher.setPublisher_email(publisher.getPublisher_email());
            previousPublisher.setPublisher_phone(publisher.getPublisher_phone());
        }
    }

    public void deletePublisher(long id)
    {
        publisherRepository.deleteById(id);
    }
}
