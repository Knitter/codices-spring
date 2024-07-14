package eu.sergiolopes.codices.controllers;

import eu.sergiolopes.codices.services.SeriesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SeriesController {

    private final SeriesService service;

    public SeriesController(SeriesService service) {
        this.service = service;
    }

    @RequestMapping("/series")
    public String index(Model model) {
        model.addAttribute("series", service.findAll());
        return "series";
    }

    //@RequestMapping("/series/edit/<id>")
    public void edit() {

    }

    //@RequestMapping("/series/delete/<id>")
    public void delete() {

    }

    @RequestMapping("/series/create")
    public void create() {

    }
}
