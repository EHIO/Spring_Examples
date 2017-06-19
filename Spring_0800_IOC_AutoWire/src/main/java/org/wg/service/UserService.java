package org.wg.service;


import org.wg.dao.UserDAO;
import org.wg.model.User;

public class UserService {
	
	private UserDAO userDAO;
	public void add(User user) {
		userDAO.save(user);
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	

}
