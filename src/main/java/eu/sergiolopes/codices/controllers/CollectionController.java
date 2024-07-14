package eu.sergiolopes.codices.controllers;

import eu.sergiolopes.codices.services.CollectionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CollectionController {

    private final CollectionService service;

    public CollectionController(CollectionService service) {
        this.service = service;
    }

    @RequestMapping("/collections")
    public String index(Model model) {
        model.addAttribute("collections", service.findAll());
        return "collections";
    }

    //@RequestMapping("/collections/edit/<id>")
    public void edit() {

    }

    //@RequestMapping("/collections/delete/<id>")
    public void delete() {

    }

    @RequestMapping("/collections/create")
    public void create() {

    }
}
