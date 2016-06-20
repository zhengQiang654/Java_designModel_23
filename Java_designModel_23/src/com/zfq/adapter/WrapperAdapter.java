package com.zfq.adapter;
/*
 * 对象的适配器模式
 * 提供源的实例 ， 提供相应的方法， 构造函数
 * 在相应的方法中调用源的相应的方法
 */
public class WrapperAdapter  implements TargetSource{
	private Source source ;
	public WrapperAdapter(Source source ) {
		this.source =  source;
	}
	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("method2 is done ");
	}

}
