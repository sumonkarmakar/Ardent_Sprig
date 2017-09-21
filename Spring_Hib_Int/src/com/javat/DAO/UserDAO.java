package com.javat.DAO;

import java.util.List;

import com.javat.domain.User;

public interface UserDAO {
	public void saveUser(User user) ;
	public List<User> listUser() ;
}
