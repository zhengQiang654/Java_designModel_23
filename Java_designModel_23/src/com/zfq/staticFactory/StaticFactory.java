package com.zfq.staticFactory;

import javax.print.attribute.standard.RequestingUserName;

import com.zfq.factory.MailSender;
import com.zfq.factory.Sender;
import com.zfq.factory.SmsSender;
/*将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可*/
public class StaticFactory {
	
	public static Sender getMailSender(){
		return new MailSender();
	}
	public static Sender getSMSSender (){
		return new SmsSender();
	}
}
