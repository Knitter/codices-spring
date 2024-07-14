package eu.sergiolopes.codices.repositories;

import eu.sergiolopes.codices.models.Collection;
import org.springframework.data.repository.CrudRepository;

public interface CollectionRepository extends CrudRepository<Collection, Long> {
}
