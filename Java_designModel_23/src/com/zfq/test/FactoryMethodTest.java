package com.zfq.test;

import com.zfq.factory.Sender;
import com.zfq.factory.SenderFactory;

public class FactoryMethodTest {
	public static void main(String args []){
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.getSenderMethod("mail");
		sender.Sender();
	}
}
