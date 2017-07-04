package org.wg.dao.impl;

import org.springframework.stereotype.Component;
import org.wg.dao.UserDAO;
import org.wg.model.User;

@Component("u")
public class UserDAOImpl extends SuperDAO implements UserDAO {

    //new UserDAOImpl( new AbstractDAO

    public void save(User user) {

        this.getHibernateTemplate().save(user);

        //throw new RuntimeException("exeption!");
    }

}
