package org.wg.service;

import org.junit.Test;
import org.wg.aop.LogInterceptor;
import org.wg.dao.UserDAO;
import org.wg.dao.impl.UserDAOImpl;
import org.wg.model.User;
import org.wg.spring.BeanFactory;
import org.wg.spring.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;


public class UserServiceTest {

    @Test
    public void testAdd() throws Exception {
        BeanFactory applicationContext = new ClassPathXmlApplicationContext();


        UserService service = (UserService) applicationContext.getBean("userService");


        User u = new User();
        u.setUsername("zhangsan");
        u.setPassword("zhangsan");
        service.add(u);
    }

    @Test
    public void testProxy() {
        UserDAO userDAO = new UserDAOImpl();//代理对象
        LogInterceptor li = new LogInterceptor();//代理的处理逻辑
        li.setTarget(userDAO);
        //产生代理对象
        UserDAO userDAOProxy = (UserDAO) Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), userDAO.getClass().getInterfaces(), li);
        System.out.println(userDAOProxy.getClass());
        userDAOProxy.delete();
        userDAOProxy.save(new User());

    }

	/*class $Proxy4 implements UserDAO 
	 * {
	 * 	save(User u) {
	 * 	Method m = UserDAO.getclass.getmethod 
	 * li.invoke(this, m, u)
	 * }
	 * }
	 */

}
