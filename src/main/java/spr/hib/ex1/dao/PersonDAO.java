package spr.hib.ex1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spr.hib.ex1.entities.Person;
import spr.hib.ex1.util.HibernateUtils;

import java.util.List;

@Repository
public class PersonDAO implements IPersonDAO {

    @Autowired
    private HibernateUtils hibernateUtils;

    public void add(Person p) {
        hibernateUtils.create(p);
    }

    public void update(Person p) {
        hibernateUtils.update(p);
    }

    public void remove(Person p) { hibernateUtils.delete(p); }

    public Person getById(int id) {
        return hibernateUtils.getById(id, Person.class);
    }

    public List<Person> getAll() { return hibernateUtils.getAll(Person.class); }
}
