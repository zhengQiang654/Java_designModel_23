package com.zfq.decorate;
/*
 * 适配器模式， 动态的扩展一个类的功能
 * 
 */
public class Decorace  implements SourceAble{
	private SourceAble source ;
	 public Decorace(SourceAble source ) {
		 this.source = source ;
	 }
	@Override
	public void method(){
		System.out.println("before method ");
		source.method();
		System.out.println(" after method ");
	}
	public static void main(String args[] ){
		new Decorace(new Source()).method();
	}
}
