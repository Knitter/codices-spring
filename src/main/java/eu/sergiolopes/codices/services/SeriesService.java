package eu.sergiolopes.codices.services;

import eu.sergiolopes.codices.models.Series;

public interface SeriesService {

    Iterable<Series> findAll();
}
