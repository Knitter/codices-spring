package eu.sergiolopes.codices.controllers;

import eu.sergiolopes.codices.services.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EbookController {

    private final ItemService service;

    public EbookController(ItemService service) {
        this.service = service;
    }

    @RequestMapping("/ebooks")
    public String index(Model model) {
        model.addAttribute("books", service.findAllEbooks());
        return "ebooks";
    }

    //@RequestMapping("/ebooks/edit/<id>")
    public void edit() {

    }

    //@RequestMapping("/ebooks/delete/<id>")
    public void delete() {

    }

    @RequestMapping("/ebooks/create")
    public void create() {

    }
}
