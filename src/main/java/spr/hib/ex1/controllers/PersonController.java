package spr.hib.ex1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spr.hib.ex1.services.PersonService;

@Controller
@RequestMapping("/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "list", method= RequestMethod.GET)
    public String listPersons(Model model){
//        Person p = new Person();
//        p.setAge(23);
//        p.setFirstName("Simon");
//        p.setLastName("Suka");
//        personService.add(p);

        model.addAttribute("persons", personService.getAll());
        return "index";
    }
}
