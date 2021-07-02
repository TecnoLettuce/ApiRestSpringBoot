package com.training.ApiRest.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.ApiRest.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<User> listAll() {
		
		// Lista todos los usuarios 
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<User> consulta = currentSession.createQuery("from User", User.class);
		
		List<User> users = consulta.getResultList();
		
			
		return users;
	}

	@Override
	public User listById(int id) {
		// Lista un usuario por su ID
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		User user = currentSession.get(User.class, id);
		
		return user;
	}

	@Override
	public void save(User user) {
		// Crea o actualiza un nuevo usuario
		
		Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(user);
		
	}

	@Override
	public void deleteById(int id) {
		// Elimina un usuario
		
		Session currentSession = entityManager.unwrap(Session.class);

        Query<User> theQuery = currentSession.createQuery("delete from User where id=:idUser");

        theQuery.setParameter("idUser", id);
        theQuery.executeUpdate();
		
	}

}
