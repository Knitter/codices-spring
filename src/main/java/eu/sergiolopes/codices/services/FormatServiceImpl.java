package eu.sergiolopes.codices.services;

import eu.sergiolopes.codices.models.Format;
import eu.sergiolopes.codices.repositories.FormatRepository;
import org.springframework.stereotype.Service;

@Service
public class FormatServiceImpl implements FormatService {

    private final FormatRepository repository;

    public FormatServiceImpl(FormatRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Format> findAll() {
        return repository.findAll();
    }
}
