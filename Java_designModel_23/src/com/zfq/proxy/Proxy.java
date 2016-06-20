package com.zfq.proxy;
/*
 * 客户不能直接的引用对象， 需要通过中介
 * 代理角色：代理对象角色内部含有对真实对象的引用，从而可以操作真实对象，同时代理对象提供与真实对象相同的接口以便在任何时刻都能代替真实对象。同时，
 * 代理对象可以在执行真实对象操作时，附加其他的操作，相当于对真实对象进行封装
 */
public class Proxy  implements SourceInterface{
	private SourceInterface source ;
	
	public Proxy(SourceInterface source ) {
		this.source = source;
	 }
	@Override
	public void method() {
		source.method();
		System.out.println("method is done ");
	}

}
