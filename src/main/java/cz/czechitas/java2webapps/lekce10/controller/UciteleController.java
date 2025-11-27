package cz.czechitas.java2webapps.lekce10.controller;

import cz.czechitas.java2webapps.lekce10.service.UciteleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ucitele")
public class UciteleController {
    private final UciteleService uciteleService;

    public UciteleController(UciteleService uciteleService) {
        this.uciteleService = uciteleService;
    }

    @GetMapping("")
    public ModelAndView ucitele() {
        ModelAndView mav = new ModelAndView("/ucitele/index");
        mav.addObject("ucitele", uciteleService.findAll());
        return mav;
    }

    @GetMapping("/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/ucitele/detail");
        modelAndView.addObject("ucitel", uciteleService.findById(id));
        return modelAndView;
    }
}
