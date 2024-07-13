package eu.sergiolopes.codices.services;

import eu.sergiolopes.codices.models.Collection;
import eu.sergiolopes.codices.repositories.CollectionRepository;
import org.springframework.stereotype.Service;

@Service
public class CollectionServiceImpl implements CollectionService {

    private final CollectionRepository repository;

    public CollectionServiceImpl(CollectionRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Collection> findAll() {
        return repository.findAll();
    }
}
