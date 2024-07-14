package eu.sergiolopes.codices.controllers;

import eu.sergiolopes.codices.services.PublisherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController {

    private final PublisherService service;

    public PublisherController(PublisherService service) {
        this.service = service;
    }

    @GetMapping("/publishers")
    public String index(Model model) {
        model.addAttribute("publishers", service.findAll());
        return "publishers";
    }

    //@RequestMapping("/publishers/edit/<id>")
    public void edit() {

    }

    //@RequestMapping("/publishers/delete/<id>")
    public void delete() {

    }

    @RequestMapping("/publishers/create")
    public void create() {

    }
}
