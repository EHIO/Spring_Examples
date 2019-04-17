package org.wg.proxy.jdk;

import org.wg.proxy.PerformanceMonitor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceHandle implements InvocationHandler {

	private Object target;

	public PerformanceHandle(Object target) {
		this.target = target;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		PerformanceMonitor.begin(target.getClass().getName() + "." + method.getName());
		Object result = method.invoke(target, args);
		PerformanceMonitor.end();
		return result;
	}
}
