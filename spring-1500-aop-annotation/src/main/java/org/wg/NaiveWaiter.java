package org.wg;

import org.springframework.stereotype.Component;

@Component
public class NaiveWaiter implements Waiter {

	public void greetTo(String clientName) {
		System.out.println("NaiveWaiter:greet to " + clientName + "...");
	}

	public void serveTo(String clientName) {
		System.out.println("NaiveWaiter:serving " + clientName + "...");
	}
}
