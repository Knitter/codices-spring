package eu.sergiolopes.codices.controllers;

import eu.sergiolopes.codices.services.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SeriesController {

    private final SeriesService service;

    @Autowired
    public SeriesController(SeriesService service) {
        this.service = service;
    }

    @RequestMapping("/series")
    public void index() {
    }

    public void edit() {

    }

    public void delete() {

    }

    public void create() {

    }
}
