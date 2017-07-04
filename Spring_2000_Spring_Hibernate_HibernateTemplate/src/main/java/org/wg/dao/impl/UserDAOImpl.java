package org.wg.dao.impl;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.wg.dao.UserDAO;
import org.wg.model.User;

import javax.annotation.Resource;

@Component("u")
public class UserDAOImpl implements UserDAO {

    private HibernateTemplate hibernateTemplate;


    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }


    @Resource
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }


    public void save(User user) {

        hibernateTemplate.save(user);

        //throw new RuntimeException("exeption!");
    }

}
