package eu.sergiolopes.codices.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

    public DashboardController() {

    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
