package com.zfq.memento;

import com.mysql.fabric.xmlrpc.base.Value;

import lombok.Getter;
import lombok.Setter;

public class Memento {
	@Getter @Setter
	private  String value;
	public Memento(String value ) {
		this.value = value;
	}
}
