package eu.sergiolopes.codices.services;

import eu.sergiolopes.codices.models.Publisher;

public interface PublisherService {

    Iterable<Publisher> findAll();
}
