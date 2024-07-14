package eu.sergiolopes.codices.repositories;

import eu.sergiolopes.codices.models.Series;
import org.springframework.data.repository.CrudRepository;

public interface SeriesRepository extends CrudRepository<Series, Long> {
}
