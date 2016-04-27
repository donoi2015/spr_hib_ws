package spr.hib.ex1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spr.hib.ex1.dao.PersonDAO;
import spr.hib.ex1.entities.Person;

import java.util.List;

@Service
public class PersonService implements IPersonService {

    @Autowired
    private PersonDAO personDAO;

    public void add(Person p) {
        personDAO.add(p);
    }

    public void update(Person p) {
        personDAO.update(p);
    }

    public void remove(Person p) {
        personDAO.remove(p);
    }

    public Person getById(int id) {
        return personDAO.getById(id);
    }

    public List<Person> getAll() {
        return personDAO.getAll();
    }
}
