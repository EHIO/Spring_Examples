package org.wg.dao.impl;

import org.springframework.stereotype.Component;
import org.wg.dao.LogDAO;
import org.wg.model.Log;

@Component("logDAO")
public class LogDAOImpl extends SuperDAO implements LogDAO {


    public void save(Log log) {

        //this.getHibernateTemplate().save(log);
        this.getHibernateTemplate().save(log);
        //throw new RuntimeException("error!");
    }

}
