package com.zfq.abstractFactory;

import com.zfq.factory.MailSender;
import com.zfq.factory.Sender;

public class MailSenderFactory implements Provider {

	@Override
	public Sender getSender() {
		return new MailSender();
	}

}
