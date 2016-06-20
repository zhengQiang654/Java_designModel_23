package com.zfq.command;

import lombok.Getter;
import lombok.Setter;

public class Invocation {
	@Setter @Getter
	private Command command;
	public Invocation(Command command) {
		this.command = command;
	}
	public void action(){
		command.exe();
	}
	
	
}
