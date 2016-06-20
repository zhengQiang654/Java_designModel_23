package com.zfq.prototype;

/*
 * 原型模式。 
 * 实现clonable接口， 并写一个方法调用父类的supper.clone()方法，
 */
public class Procotype  implements Cloneable{
	//，super.clone()调用的是Object的clone()方法，而在Object类中，clone()是native的
	public Procotype clone () throws CloneNotSupportedException{
		return (Procotype) super.clone();
		
	}
	
}
