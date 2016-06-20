package com.zfq.test;

import com.zfq.visit.MySubject;
import com.zfq.visit.MyVisit;
import com.zfq.visit.Subject;
import com.zfq.visit.Visit;

public class VisitTest {

	public static void main(String[] args) {
		Visit visit = new MyVisit();
		Subject subject = new MySubject();
		subject.accept(visit);
	}

}
