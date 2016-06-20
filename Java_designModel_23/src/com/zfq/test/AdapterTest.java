package com.zfq.test;

import com.zfq.adapter.Adapter;
import com.zfq.adapter.TargetSource;

public class AdapterTest {
	public static void main(String args [] ){
		TargetSource target = new Adapter();
		target.method1();
		target.method2();
	}
}
