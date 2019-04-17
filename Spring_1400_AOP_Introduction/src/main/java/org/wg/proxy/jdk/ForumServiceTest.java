package org.wg.proxy.jdk;


import org.wg.proxy.ForumService;

import java.lang.reflect.Proxy;

public class ForumServiceTest {

    public static void main(String[] args) {

		ForumService target = new ForumServiceImpl();

		PerformanceHandle handle = new PerformanceHandle(target);
		ForumService proxy = (ForumService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				handle);
		proxy.removeForum(10);
		proxy.removeTopic(100);

    }
}
