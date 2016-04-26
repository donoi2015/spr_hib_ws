package spr.hib.ex1.dao;

import spr.hib.ex1.entities.Person;
import java.util.List;

public interface PersonDAO {

    public void addPerson(Person p);
    public void updatePerson(Person p);
    public void removePerson(int id);
    public Person getPersonById(int id);
    public List<Person> getAll();

}
