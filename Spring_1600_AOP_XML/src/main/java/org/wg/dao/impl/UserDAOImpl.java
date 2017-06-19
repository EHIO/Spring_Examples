package org.wg.dao.impl;

import org.springframework.stereotype.Component;
import org.wg.dao.UserDAO;
import org.wg.model.User;

@Component("u")
public class UserDAOImpl implements UserDAO {

    public void save(User user) {
        //Hibernate
        //JDBC
        //XML
        //NetWork
        System.out.println("user saved!");
        //throw new RuntimeException("exeption!");
    }

}
