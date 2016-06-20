package com.zfq.test;

import com.zfq.bridge.BridgeSourceAble;
import com.zfq.bridge.MyBridgeSourceAble;
import com.zfq.bridge.SourceAbleImp1;
import com.zfq.bridge.SourceAbleImp2;

public class BridgeTest {
	public static void main(String args []){
		BridgeSourceAble bridge = new MyBridgeSourceAble();
		
		SourceAbleImp1 source1 = new SourceAbleImp1();
		bridge.setSourceable(source1);
		bridge.method();
		

		SourceAbleImp2 source2 = new SourceAbleImp2();
		bridge.setSourceable(source2);
		bridge.method();
		
	}
}
