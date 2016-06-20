package com.zfq.adapter;

import org.junit.Test;

public class AbstraceInterfaceImp  extends AbstractAdapter{

	@Override
	public void method1() {
		super.method1();
	}

	@Override
	public void method2() {
		super.method2();
	}
	
	@Test
	public void test(){
		new AbstraceInterfaceImp ().method1();
		}
	
	
}
