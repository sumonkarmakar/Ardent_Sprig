package com.javat.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.javat.DAO.UserDAO;
import com.javat.domain.User;

public class UserDAOImpl implements UserDAO {
	
	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) 
    {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void saveUser(User user) {
		hibernateTemplate.saveOrUpdate(user);
	}

	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
