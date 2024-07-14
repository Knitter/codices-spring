package eu.sergiolopes.codices.services;

import eu.sergiolopes.codices.models.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}
