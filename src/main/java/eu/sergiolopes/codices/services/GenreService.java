package eu.sergiolopes.codices.services;

import eu.sergiolopes.codices.models.Genre;

public interface GenreService {

    Iterable<Genre> findAll();
}
