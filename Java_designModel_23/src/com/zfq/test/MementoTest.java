package com.zfq.test;

import org.junit.experimental.theories.Theories;

import com.zfq.memento.Origional;
import com.zfq.memento.Storage;

public class MementoTest {
	public static void main(String[] args) {
		
		//创建原始类
		Origional origional = new Origional("aaa");
		//创建备忘录
		Storage storage = new Storage(origional.createMemento(origional.getValue()));
		//修改原始类
		origional.setValue("bb");
		origional.getMemento().setValue(origional.getValue());
		
		//恢复原始类
		origional.restoreMemento(storage.getMemento());
		
	}
}
