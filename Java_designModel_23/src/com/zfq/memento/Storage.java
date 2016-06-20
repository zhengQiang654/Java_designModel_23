package com.zfq.memento;

import lombok.Getter;
import lombok.Setter;

public class Storage {
	@Getter @Setter
	private Memento memento;
	public Storage(Memento memento) {
		this.memento = memento;
	}
	
}
