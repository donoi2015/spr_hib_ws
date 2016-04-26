package spr.hib.ex1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spr.hib.ex1.dao.PersonDAO;
import spr.hib.ex1.entities.Person;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO personDAO;

    public void addPerson(Person p) {

    }

    public void updatePerson(Person p) {

    }

    public void removePerson(int id) {

    }

    public Person getPersonById(int id) {
        return null;
    }

    public List<Person> getAll() {
        return null;
    }
}
