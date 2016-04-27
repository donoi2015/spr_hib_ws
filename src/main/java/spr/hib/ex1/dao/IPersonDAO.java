package spr.hib.ex1.dao;

import spr.hib.ex1.entities.Person;
import java.util.List;

public interface IPersonDAO {

    public void add(Person p);
    public void update(Person p);
    public void remove(Person p);
    public Person getById(int id);
    public List<Person> getAll();

}
