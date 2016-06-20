package com.zfq.adapter;
/*
 * 适配器模式 
 * 是将某个类的接口转化为客户端希望的另外的一个接口表示，
 *  目的是消除由于接口的不匹配所造成得类的兼容性问题
 */

//类的适配器模式
public class Adapter  extends Source implements TargetSource{

	@Override
	public void method2() {
		System.out.println("method2 is done ");
	}

}
