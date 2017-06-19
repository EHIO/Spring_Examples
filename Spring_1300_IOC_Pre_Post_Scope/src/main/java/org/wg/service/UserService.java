package org.wg.service;

import org.springframework.stereotype.Component;
import org.wg.dao.UserDAO;
import org.wg.model.User;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


@Component("userService")
public class UserService {

    private UserDAO userDAO;

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    public void add(User user) {
        userDAO.save(user);
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    @Resource(name = "u")
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }
}
