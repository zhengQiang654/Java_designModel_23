package com.zfq.clone.deepAndnomal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype  implements Cloneable , Serializable{
	private static final long serialVersionID = 1L ;
	private String string;  
    private SerializableObject obj;  
  
	//浅复制
    /*将一个对象复制后， 基本的数据类型都会被创建， 但是， 引用类型还是指向原对象所指向的
     * 
     * 
     */
	public Prototype clone () throws CloneNotSupportedException{
		return (Prototype) super.clone();
	}
	//深复制
	//将一个对象复制后， 不仅基本的数据类型会被创建，  而且所有的引用类型都会被重新创建
	public Prototype deepClone () throws IOException, ClassNotFoundException{
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (Prototype) ois.readObject();
		
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public SerializableObject getObj() {
		return obj;
	}
	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}
	
	
}
