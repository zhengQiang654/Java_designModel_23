package com.zfq.iterator;

import lombok.Getter;
import lombok.Setter;

public class MyIterator implements Iterator {
	@Getter @Setter
	private Connection Connection ;
	private int pos = -1 ;
	
	public MyIterator() {
	}
	public MyIterator(Connection connection) {
		this.Connection = connection;
	}
	
	@Override
	public Object first() {
		
		return Connection.get(0);
	}
	@Override
	public boolean hasNext(){
		return pos < (Connection.size()-1);
	}

	@Override
	public String  previios() {
		if (pos > 0){
			--pos;
			return (String) Connection.get(pos);
		}
		return null;
		
	}

	@Override
	public String  next() {
		return (String) Connection.get(++pos);
	}

}
