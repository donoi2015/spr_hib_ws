package spr.hib.ex1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spr.hib.ex1.entities.Person;

import java.util.List;

@Repository
public class PersonDAOImpl implements PersonDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session session;

    public void addPerson(Person p) {
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(p);
        tx.commit();
        session.close();
    }

    public void updatePerson(Person p) {
        session.update(p);
    }

    public void removePerson(int id) {

    }

    public Person getPersonById(int id) {
        return null;
    }

    public List<Person> getAll() {
        session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        List<Person> persons = session.createQuery("from Person").list();
        session.close();
        return persons;
    }
}
