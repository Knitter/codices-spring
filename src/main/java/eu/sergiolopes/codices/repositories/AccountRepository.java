package eu.sergiolopes.codices.repositories;

import eu.sergiolopes.codices.models.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
