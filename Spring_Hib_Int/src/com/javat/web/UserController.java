package com.javat.web;

//import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.javat.DAO.UserDAO;
import com.javat.domain.User;

public class UserController extends MultiActionController{
	private UserDAO userDAO;

	public void setUserDao(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response, User user) throws Exception{
		userDAO.saveUser(user);
		return new ModelAndView("redirect:list.htm");
	}
}
