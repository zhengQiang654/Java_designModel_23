package com.zfq.test;

import com.zfq.facade.CPU;
import com.zfq.facade.Computer;
import com.zfq.facade.Disk;
import com.zfq.facade.Memory;

public class FacadeTest {
	public static void main(String args []){
		Computer computer = new Computer(new CPU(), new Memory(), new Disk());
		computer.startup();
		computer.shutdown();
	}
}
