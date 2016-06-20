package com.zfq.command;

import lombok.Getter;
import lombok.Setter;

public class MyCommand  implements Command{
	@Setter 
	@Getter
	private Receiver receiver ;
	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	@Override
	public void exe() {
		receiver.action();
	}

}
