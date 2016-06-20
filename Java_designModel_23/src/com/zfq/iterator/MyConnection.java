package com.zfq.iterator;

public class MyConnection  implements Connection{
	private String [] str = {"aa", "bb"};
	@Override
	public Iterator iterator() {
		return new MyIterator();
	}

	@Override
	public Object get(int i ) {
		return str[i] ;
	}

	@Override
	public int size() {
		return str.length;
	}

}
