package eu.sergiolopes.codices.controllers;

import eu.sergiolopes.codices.services.ItemService;
import eu.sergiolopes.codices.services.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final ItemService service;

    public BookController(ItemService service) {
        this.service = service;
    }

    @RequestMapping("/books")
    public String index(Model model) {
        model.addAttribute("books", service.findAllBooks());
        return "books";
    }

    //@RequestMapping("/books/edit/<id>")
    public void edit() {

    }

    //@RequestMapping("/books/delete/<id>")
    public void delete() {

    }

    @RequestMapping("/books/create")
    public void create() {

    }
}
