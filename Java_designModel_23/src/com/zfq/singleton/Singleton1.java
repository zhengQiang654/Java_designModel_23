package com.zfq.singleton;

public class Singleton1 {
	
	//私有话构造函数
	/*其实说它完美，也不一定，如果在构造函数中抛出异常，实例将永远得不到创建*/
	private Singleton1 (){}
	public Object readResolve (){
		return getInstance();
	}
	private Singleton1  getInstance() {
		return new SingletonFactory1().instance ;
	}
	

	//静态内部类，使用静态内部类泪维护单例模式
	private static class  SingletonFactory1{
		
		private  static Singleton1 instance = new Singleton1() ;
		
			} 
	
}
