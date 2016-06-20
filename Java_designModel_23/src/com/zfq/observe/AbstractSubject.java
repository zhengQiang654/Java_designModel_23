package com.zfq.observe;

import java.util.Enumeration;
import java.util.Vector;

public  abstract class AbstractSubject  implements Subject{
	private Vector<Observer> vector = new Vector<Observer>();
	
	@Override
	public void add(Observer observer) {
		vector.addElement(observer);
	}

	@Override
	public void dele(Observer observer) {
		vector.remove(observer);
	}

	@Override
	public void notifyAbserver() {
	    Enumeration<Observer> enums = 	vector.elements();
	    while(enums.hasMoreElements()){
	    	enums.nextElement().update();
	    }
	}
	
	
}
