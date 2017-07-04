package org.wg.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.wg.dao.LogDAO;
import org.wg.model.Log;

import javax.annotation.Resource;

@Component("logDAO")
public class LogDAOImpl implements LogDAO {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Log log) {

        Session s = sessionFactory.getCurrentSession();
        s.save(log);
        //throw new RuntimeException("error!");
    }

}
