package org.wg.dao.impl;

import org.wg.aop.LogInterceptor;
import org.wg.dao.UserDAO;
import org.wg.model.User;

public class UserDAOImpl3 implements UserDAO {

    private UserDAO userDAO = new UserDAOImpl();

    public void save(User user) {

        new LogInterceptor().beforeMethod(null);
        userDAO.save(user);


    }

    public void delete() {
        // TODO Auto-generated method stub

    }
}
