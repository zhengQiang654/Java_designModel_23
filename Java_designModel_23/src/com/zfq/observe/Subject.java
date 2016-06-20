package com.zfq.observe;

public interface Subject {
	/*添加观察者*/
	public void add(Observer observer);
	
	/*删除观察者*/
	public void dele(Observer observer );

	/*唤醒所有观察者*/
	public void notifyAbserver();
	
	/*自身的操作*/
	public void operation();
}
