package com.zfq.visit;

import lombok.Getter;
import lombok.Setter;

public class MySubject implements Subject {
	@Getter
	@Setter
	private Visit visit;
	
	@Override
	public String getSubject() {
		return "love";
	}

	@Override
	public void accept(Visit visit) {
		visit.visit(this);
	}

}
