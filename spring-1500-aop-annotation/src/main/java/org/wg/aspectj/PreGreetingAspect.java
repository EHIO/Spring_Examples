package org.wg.aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PreGreetingAspect {
	// 为所有类中的greetTo方法进行前置增强
	@Before("execution(* greetTo(..))")
	public void beforeGreeting() {
		System.out.println("How are you");
	}

	//后置增强切面,为所有标注了NeedTest注解的所有方法进行后置增强
	@AfterReturning("@annotation(org.wg.anno.NeedTest)")
	public void needTestFun() {
		System.out.println("needTestFun() executed!");
	}
}
