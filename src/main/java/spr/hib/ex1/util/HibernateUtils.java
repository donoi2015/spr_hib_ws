package spr.hib.ex1.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Repository
//Transaction is managed by Spring(thus no need to wrap save queries in Transaction.beginTransaction, Transaction.commit)
@Transactional
public class HibernateUtils {

	@Autowired
	private SessionFactory mySessionFactory;

	public <T> Serializable create(final T entity) {
		return getSession().save(entity);
	}

	public <T> T update(final T entity) {
		getSession().update(entity);
		return entity;
	}

	public <T> void delete(final T entity) {
		getSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> getAll(Class<T> entityClass) {
		return getSession().createQuery(" FROM " + entityClass.getName()).list();
	}

	@SuppressWarnings("unchecked")
	public <T> T getById(Serializable id, Class<T> entityClass) {
		return (T) getSession().get(entityClass, id);
	}

	private Session getSession(){
		return mySessionFactory.getCurrentSession();
	}
}