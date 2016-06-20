package com.zfq.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.omg.PortableInterceptor.ObjectReferenceTemplate;

public class DynamicProxy  implements InvocationHandler{
	private Object object  ;
	public DynamicProxy(Object object ) {
		this.object = object;
		
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 注意参数
		return method.invoke(object, args);
	}

}
