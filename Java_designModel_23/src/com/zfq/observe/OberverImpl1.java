package com.zfq.observe;

public class OberverImpl1  implements Observer{

	@Override
	public void update() {
		System.out.println("Observer1 has know it ");
	}

}
