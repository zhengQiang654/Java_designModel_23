package com.zfq.memento;

import lombok.Getter;
import lombok.Setter;
/*
 * 备忘录模式
 * 保存一个对象的摸个状态
 */
public class Origional {
	@Getter @Setter
	private String value ;
	@Getter @Setter
	private Memento memento ;
	public Origional() {
	}
	public Origional(String value){
		this.value = value;
	}
	public Memento createMemento(String value){
		return new Memento(value);
	}
	public void restoreMemento(Memento memento ){
		this.value = memento.getValue();
	}
}

