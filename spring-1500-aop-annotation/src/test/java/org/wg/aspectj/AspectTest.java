package org.wg.aspectj;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.wg.NaughtyWaiter;
import org.wg.Waiter;


public class AspectTest {
    @Test
    public void test() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Waiter waiter = (Waiter) ctx.getBean("naiveWaiter");
        System.out.println(waiter.getClass());
        waiter.greetTo("John");
        waiter.serveTo("Tom");
    }

    @Test
    public void pointcut() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");
        Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
        // 该方法被织入增强
        naughtyWaiter.serveTo("John");
        // 该方法未被织入增强
        naiveWaiter.serveTo("Tom");
    }
}
