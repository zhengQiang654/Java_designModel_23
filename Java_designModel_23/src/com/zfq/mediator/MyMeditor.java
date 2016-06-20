package com.zfq.mediator;

import lombok.Getter;
import lombok.Setter;

public class MyMeditor  implements Mediator{
	@Getter
	@Setter
	private User1 User1 ;
	@Getter
	@Setter
	private User2 User2 ;
	
	public MyMeditor() {
	}
	@Override
	public void workAll() {
		User1.work();
		User2.work();
	}

	@Override
	public void   createMediator() {
		User1 = new User1(this);
		User2 = new User2(this);
	}

}
