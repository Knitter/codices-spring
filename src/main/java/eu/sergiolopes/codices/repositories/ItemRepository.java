package eu.sergiolopes.codices.repositories;

import eu.sergiolopes.codices.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
