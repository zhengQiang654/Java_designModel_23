package com.zfq.test;

import com.zfq.command.Invocation;
import com.zfq.command.MyCommand;
import com.zfq.command.Receiver;

public class CommandTest {
	public static void main(String[] args) {
		Invocation invocation = new Invocation(new MyCommand(new Receiver()));
		invocation.action();
	}
}
