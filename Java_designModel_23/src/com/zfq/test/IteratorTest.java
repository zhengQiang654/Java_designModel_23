package com.zfq.test;

import com.zfq.iterator.Connection;
import com.zfq.iterator.Iterator;
import com.zfq.iterator.MyConnection;
import com.zfq.iterator.MyIterator;

public class IteratorTest {
 public static void main(String args []){
	 Connection connection = new MyConnection();
	 
	 Iterator iterator = new MyIterator(connection);
	 while(iterator.hasNext()){
		 System.out.println(iterator.next());
	 }
	 
	 
 }
}
