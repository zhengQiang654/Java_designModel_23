package com.zfq.test;

import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.WeakHashMap;

import org.junit.Test;

import com.zfq.proxy.DynamicProxy;
import com.zfq.proxy.Source;
import com.zfq.proxy.SourceInterface;

public class DynamicProxyTest {
	public static void main(String args []){
		Source source = new Source();
		//动态代理
		SourceInterface  sourceInterface = (SourceInterface) Proxy.newProxyInstance(SourceInterface.class.getClassLoader(),new Class []{SourceInterface.class}, new DynamicProxy(source));
		sourceInterface.method();
	}
	@Test
	public  void testProxyConstructor(){
		Proxy.newProxyInstance(SourceInterface.class.getClassLoader(), new Class []{SourceInterface.class},null) ;
	}
	
}
