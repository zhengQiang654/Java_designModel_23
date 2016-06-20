package com.zfq.singleton;
/*
 * 毫无线程安全保护 ， 在多线程中很容易出现问题
 */
public class Singleton {
//单例设计模式
	/*将对象持有私有化， 反之被引用， 目的是实现延迟加载*/
	private static Singleton singleton = null;
	//将构造函数私有化，防止被实例化
	private Singleton(){
	}
	//提供静态的方法获取实例
	public static Singleton getInstance (){
		if (singleton == null) {
			return  singleton = new Singleton();
		}
		else return singleton ;
	}
	/*如果该对象由于序列化， 可以保证在序列化前前后保持一致*/
	public Object readResolve(){
		return singleton;
	}
}
