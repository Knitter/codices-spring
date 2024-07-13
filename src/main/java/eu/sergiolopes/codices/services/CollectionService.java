package eu.sergiolopes.codices.services;

import eu.sergiolopes.codices.models.Collection;

public interface CollectionService {

    Iterable<Collection> findAll();
}
