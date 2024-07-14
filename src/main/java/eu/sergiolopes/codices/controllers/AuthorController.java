package eu.sergiolopes.codices.controllers;

import eu.sergiolopes.codices.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @RequestMapping("/authors")
    public String index(Model model) {
        model.addAttribute("authors", service.findAll());
        return "authors";
    }

    //@RequestMapping("/authors/edit/<id>")
    public void edit() {

    }

    //@RequestMapping("/authors/delete/<id>")
    public void delete() {

    }

    @RequestMapping("/authors/create")
    public void create() {

    }
}
