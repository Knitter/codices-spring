package eu.sergiolopes.codices.services;

import eu.sergiolopes.codices.models.Genre;
import eu.sergiolopes.codices.repositories.GenreRepository;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceImpl implements GenreService {

    private final GenreRepository repository;

    public GenreServiceImpl(GenreRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Genre> findAll() {
        return repository.findAll();
    }
}
