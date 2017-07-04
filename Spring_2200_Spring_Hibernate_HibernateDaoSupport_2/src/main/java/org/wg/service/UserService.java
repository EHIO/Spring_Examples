package org.wg.service;

import org.springframework.stereotype.Component;
import org.wg.dao.LogDAO;
import org.wg.dao.UserDAO;
import org.wg.model.Log;
import org.wg.model.User;

import javax.annotation.Resource;


@Component("userService")
public class UserService {

    private UserDAO userDAO;
    private LogDAO logDAO;

    public void init() {
        System.out.println("init");
    }

    public User getUser(int id) {
        return null;
    }

    //@Transactional(readOnly=true)
    public void add(User user) {

        userDAO.save(user);
        Log log = new Log();
        log.setMsg("a user saved!");
        logDAO.save(log);

    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    @Resource(name = "u")
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    public LogDAO getLogDAO() {
        return logDAO;
    }

    @Resource
    public void setLogDAO(LogDAO logDAO) {
        this.logDAO = logDAO;
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
