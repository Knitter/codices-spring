package eu.sergiolopes.codices.services;

import eu.sergiolopes.codices.models.Item;
import eu.sergiolopes.codices.repositories.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository repository;

    public ItemServiceImpl(ItemRepository repository) {
        this.repository = repository;
    }

    public Iterable<Item> findAll() {
        return repository.findAll();
    }

    public Iterable<Item> findAllBooks() {
        return repository.findByType(Item.Type.PAPER.toString());
    }

    public Iterable<Item> findAllAudioBooks() {
        return repository.findByType(Item.Type.AUDIO.toString());
    }

    public Iterable<Item> findAllEbooks() {
        return repository.findByType(Item.Type.EBOOK.toString());
    }
}
