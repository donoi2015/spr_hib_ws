package spr.hib.ex1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spr.hib.ex1.services.PersonService;

/**
 * Created by dono on 4/25/16.
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;


    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("/add/{name}")
    public void addPerson(@RequestParam("name") String name){

    }
}
