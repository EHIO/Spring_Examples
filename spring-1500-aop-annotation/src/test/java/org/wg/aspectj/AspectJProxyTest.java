package org.wg.aspectj;

import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;


import org.wg.NaiveWaiter;
import org.wg.Waiter;


public class AspectJProxyTest {

	/*
	AspectJProxyFactory 为 NaiveWaiter生成织入PreGreetingAspect
	切面的代理
	*/
	@Test
	public void proxy() {
		Waiter target = new NaiveWaiter();
		AspectJProxyFactory factory = new AspectJProxyFactory();
		factory.setTarget(target);
		factory.addAspect(PreGreetingAspect.class);
		Waiter proxy = factory.getProxy();
		proxy.greetTo("John");
		proxy.serveTo("John");
	}
}
