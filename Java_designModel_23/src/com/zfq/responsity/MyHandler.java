package com.zfq.responsity;

import java.util.jar.Attributes.Name;

import lombok.Getter;
import lombok.Setter;

public class MyHandler  extends AbstractHandler implements Handler{
	@Getter @Setter
	private String name ;
	public MyHandler(String name ) {
		this.name =  name ;
	}
	
	@Override
	public void operation() {
		System.out.println(name + "operation");
		if (this.getHandler() != null) {
			this.getHandler().operation();
		}
	}

}
