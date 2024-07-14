package eu.sergiolopes.codices.controllers;

import eu.sergiolopes.codices.services.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AudioBookController {

    private final ItemService service;

    public AudioBookController(ItemService service) {
        this.service = service;
    }

    @RequestMapping("/audiobooks")
    public String index(Model model) {
        model.addAttribute("books", service.findAllAudioBooks());
        return "audiobooks";
    }

    //@RequestMapping("/audiobooks/edit/<id>")
    public void edit() {

    }

    //@RequestMapping("/audiobooks/delete/<id>")
    public void delete() {

    }

    @RequestMapping("/audiobooks/create")
    public void create() {

    }
}
