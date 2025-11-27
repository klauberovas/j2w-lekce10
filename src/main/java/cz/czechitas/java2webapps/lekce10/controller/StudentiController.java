package cz.czechitas.java2webapps.lekce10.controller;

import cz.czechitas.java2webapps.lekce10.service.StudentiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/studenti")
public class StudentiController {
    private final StudentiService studentiService;

    public StudentiController(StudentiService studentiService) {
        this.studentiService = studentiService;
    }

    @GetMapping("")
    public ModelAndView studenti() {
        ModelAndView mav = new ModelAndView("/studenti/index");
        mav.addObject("studenti", studentiService.findAll());
        return mav;
    }

    @GetMapping("/{id}")
    public ModelAndView details(@PathVariable int id) {
        ModelAndView mav = new ModelAndView("/studenti/detail");
        mav.addObject("student", studentiService.findById(id));
        return mav;
    }
}
