package com.zfq.visit;

import lombok.Getter;
import lombok.Setter;

public class MyVisit implements Visit {
	@Getter
	@Setter
	private Subject Subject ;
	
	@Override
	public void visit(Subject subject) {
		System.out.println("visit " +subject.getSubject());
	}

}
