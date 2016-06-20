package com.zfq.singleton;

public class SingletonFactory {
	private static SingletonFactory singleton = new SingletonFactory();
	/*
	 * 实际情况是单例模式是使用静态内部类来维护的，
	 * JVM能保证类在加载的时候， 线程的加载过程是互斥的，
	 */
	public static SingletonFactory getInstance (){
		return singleton;
		
	}
	
}
