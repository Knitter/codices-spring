package eu.sergiolopes.codices.services;

import eu.sergiolopes.codices.models.Author;
import eu.sergiolopes.codices.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository repository;

    public AuthorServiceImpl(AuthorRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Author> findAll() {
        return repository.findAll();
    }
}
