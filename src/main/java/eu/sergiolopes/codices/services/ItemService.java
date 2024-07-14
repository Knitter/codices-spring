package eu.sergiolopes.codices.services;

import eu.sergiolopes.codices.models.Item;

public interface ItemService {

    Iterable<Item> findAll();

    Iterable<Item> findAllBooks();

    Iterable<Item> findAllAudioBooks();

    Iterable<Item> findAllEbooks();

}
