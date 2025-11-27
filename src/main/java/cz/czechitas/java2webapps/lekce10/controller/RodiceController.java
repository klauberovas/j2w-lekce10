package cz.czechitas.java2webapps.lekce10.controller;

import cz.czechitas.java2webapps.lekce10.service.RodiceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rodice")
public class RodiceController {
    private final RodiceService rodiceService;

    public RodiceController(RodiceService rodiceService) {
        this.rodiceService = rodiceService;
    }

    @GetMapping("")
    public ModelAndView rodice() {
        ModelAndView mav = new ModelAndView("/rodice/index");
        mav.addObject("rodice", rodiceService.findAll());
        return mav;
    }

    @GetMapping("/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView mav = new ModelAndView("/rodice/detail");
        mav.addObject("rodic", rodiceService.findById(id));
        return mav;
    }
}
