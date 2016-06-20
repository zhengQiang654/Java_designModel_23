package com.zfq.bridge;

public  class BridgeSourceAble {
	//	桥接
	private SourceAble sourceable ;
	public void method(){
		sourceable.method();
	}
	public SourceAble getSourceable() {
		return sourceable;
	}
	public void setSourceable(SourceAble sourceable) {
		this.sourceable = sourceable;
	}
	
}
