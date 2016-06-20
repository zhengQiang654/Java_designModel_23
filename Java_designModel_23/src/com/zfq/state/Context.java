package com.zfq.state;

import lombok.Getter;
import lombok.Setter;

public class Context {
	@Getter @Setter
	private State state;
	public Context(State state) {
		this.state = state;
	}
	public void method(){
		if (state.getValue().equals("on")) {
			state.method1();
		}
		else {state.method2();}
	}
	
}
