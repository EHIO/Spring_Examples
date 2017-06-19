package org.wg.dao.impl;


import org.wg.dao.UserDAO;
import org.wg.model.User;

public class UserDAOImpl implements UserDAO {
    /* (non-Javadoc)
	 * @see UserDAO#save(User)
	 */

    private int daoId;
    private String daoStatus;

    public int getDaoId() {
        return daoId;
    }

    public void setDaoId(int daoId) {
        this.daoId = daoId;
    }

    public String getDaoStatus() {
        return daoStatus;
    }

    public void setDaoStatus(String daoStatus) {
        this.daoStatus = daoStatus;
    }

    public void save(User user) {
        System.out.println("user saved!");
    }

    @Override
    public String toString() {
        return this.daoId + ":" + this.daoStatus;
    }
}
