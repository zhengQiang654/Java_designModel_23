package com.zfq.test;

import com.zfq.mediator.Mediator;
import com.zfq.mediator.MyMeditor;

public class MediatorTest {
 public static void main(String[] args) {
	Mediator mediator = new MyMeditor();
	mediator.createMediator();
	mediator.workAll();
}
}
