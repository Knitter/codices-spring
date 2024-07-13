package eu.sergiolopes.codices.services;

import eu.sergiolopes.codices.models.Publisher;
import eu.sergiolopes.codices.repositories.PublisherRepository;
import org.springframework.stereotype.Service;

@Service
public class PublisherServiceImpl implements PublisherService {

    private final PublisherRepository repository;

    public PublisherServiceImpl(PublisherRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Publisher> findAll() {
        return repository.findAll();
    }
}
