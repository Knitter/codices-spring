package eu.sergiolopes.codices.repositories;

import eu.sergiolopes.codices.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
