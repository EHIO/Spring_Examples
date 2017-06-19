package org.wg;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorldTest {

	@Test
	public void testCreateObject(){
		/**
		 * 1、启动spring容器
		 * 2、从spring容器中把对象取出来
		 * 3、对象调用方法
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SpringHelloWorld helloWorld = (SpringHelloWorld)context.getBean("helloWorld");
		helloWorld.hello();
	}
}
