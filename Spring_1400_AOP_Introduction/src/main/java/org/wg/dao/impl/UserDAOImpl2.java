package org.wg.dao.impl;

import org.wg.model.User;

public class UserDAOImpl2 extends UserDAOImpl {
    @Override
    public void save(User user) {

        System.out.println("save start...");
        super.save(user);

    }
}
