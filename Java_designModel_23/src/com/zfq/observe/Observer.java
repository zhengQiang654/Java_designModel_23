package com.zfq.observe;

//观察者接口

/*观察者模式， 当一个对象变化是，其他依赖该对象的对象都会收到通知*/
public interface Observer {

	public void update();
}
