package com.zfq.state;

import lombok.Getter;
import lombok.Setter;
//状态模式
//通过改变对象的状态改变对象的行为
public class State {
	@Getter @Setter
	private String value ;
	public State(String value ) {
		this.value = value;
		
	}
	public void method1(){
		System.out.println("method1 id exe");
	}
	public void method2(){
		System.out.println("method2 id exe");
	}
}
