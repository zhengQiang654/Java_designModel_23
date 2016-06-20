package com.zfq.mediator;

import lombok.Getter;
import lombok.Setter;

public abstract class  User {
	@Setter @Getter
	private Mediator mediator ;
	public User(Mediator mediator) {
		this.mediator = mediator;
	}
	public abstract  void work();
}
