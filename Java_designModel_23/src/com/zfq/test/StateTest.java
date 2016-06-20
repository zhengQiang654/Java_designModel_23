package com.zfq.test;


import com.zfq.state.Context;
import com.zfq.state.State;

public class StateTest {

	public static void main(String[] args) {
		Context context = new Context(new State("on"));
		context.method();
	}

}
