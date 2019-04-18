package org.wg;

import org.springframework.stereotype.Component;
import org.wg.anno.NeedTest;

@Component
public class NaughtyWaiter implements Waiter {


	public void greetTo(String clientName) {
		System.out.println("NaughtyWaiter:greet to " + clientName + "...");
	}

	@NeedTest
	public void serveTo(String clientName) {
		System.out.println("NaughtyWaiter:serving " + clientName + "...");
	}

	public void joke(String clientName, int times) {
		System.out.println("NaughtyWaiter:play " + times + " jokes to " + clientName + "...");
	}
}
