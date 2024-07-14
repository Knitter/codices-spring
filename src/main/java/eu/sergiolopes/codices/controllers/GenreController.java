package eu.sergiolopes.codices.controllers;

import eu.sergiolopes.codices.services.GenreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GenreController {

    private final GenreService service;

    public GenreController(GenreService service) {
        this.service = service;
    }

    @RequestMapping("/genres")
    public String index(Model model) {
        model.addAttribute("genres", service.findAll());
        return "genres";
    }

    //@RequestMapping("/genres/edit/<id>")
    public void edit() {

    }

    //@RequestMapping("/genres/delete/<id>")
    public void delete() {

    }

    @RequestMapping("/genres/create")
    public void create() {

    }
}
