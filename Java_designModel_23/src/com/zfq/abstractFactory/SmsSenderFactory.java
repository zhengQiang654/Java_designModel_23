package com.zfq.abstractFactory;

import com.zfq.factory.MailSender;
import com.zfq.factory.Sender;
import com.zfq.factory.SmsSender;

public class SmsSenderFactory  implements Provider{

	@Override
	public Sender getSender() {
		return new SmsSender();
	}

}
