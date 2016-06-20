package com.zfq.test;

import com.zfq.observe.MySubject;
import com.zfq.observe.OberverImpl1;
import com.zfq.observe.Observer;
import com.zfq.observe.ObserverImpl2;
import com.zfq.observe.Subject;
/*观察者模式测试*/
public class ObserverTest {
 public static void main(String args []){
	 Subject subject = new MySubject();
	 subject.add(new OberverImpl1());
	 subject.add(new ObserverImpl2());
	 subject.operation();
 }
}
