package org.wg.service;


import org.junit.Test;
import org.wg.model.User;
import org.wg.service.UserService;
import org.wg.spring.BeanFactory;
import org.wg.spring.ClassPathXmlApplicationContext;

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

}
