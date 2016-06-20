package com.zfq.observe;

import com.mysql.jdbc.UpdatableResultSet;

public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("update successfullly");
		notifyAbserver();
	}

}
