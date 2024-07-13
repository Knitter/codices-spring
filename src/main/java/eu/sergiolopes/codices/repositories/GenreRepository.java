package eu.sergiolopes.codices.repositories;

import eu.sergiolopes.codices.models.Genre;
import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, Long> {
}
