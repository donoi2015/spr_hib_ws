package spr.hib.ex1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import spr.hib.ex1.entities.Person;
import spr.hib.ex1.services.PersonService;

import java.util.List;

@Controller
@RequestMapping("/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(){
        List<Person> persons = personService.getAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("persons", persons);
        return modelAndView;
    }
}
