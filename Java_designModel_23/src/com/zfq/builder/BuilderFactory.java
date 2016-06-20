package com.zfq.builder;

import java.util.ArrayList;
import java.util.List;

import com.zfq.factory.MailSender;
import com.zfq.factory.Sender;
import com.zfq.factory.SmsSender;

public class BuilderFactory {
	/*建造者模式，  工厂模式关注的是创建单个对象，  
	而创建者模式关注的是符合对象的各个部分， 
	创建者将很多的功能添加到同一个类中*/
	private static List<Sender> list = new ArrayList<Sender>();
	public static void getMailSender (){
		list.add(new MailSender());
	}
	public static void  getSmsSender (){
		list.add(new SmsSender());
	}
}
