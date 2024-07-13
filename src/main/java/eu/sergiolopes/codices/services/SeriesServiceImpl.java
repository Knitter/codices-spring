package eu.sergiolopes.codices.services;

import eu.sergiolopes.codices.repositories.SeriesRepository;
import org.springframework.stereotype.Service;

@Service
public class SeriesServiceImpl implements SeriesService {

    private final SeriesRepository repository;

    public SeriesServiceImpl(SeriesRepository repository) {
        this.repository = repository;
    }
}
