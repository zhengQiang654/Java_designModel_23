package com.zfq.facade;

import org.junit.rules.DisableOnDebug;
/*
 * 外观设计模式
 * 目的： 解决类与类之间的依赖关系；
 */
public class Computer {
	private  CPU cpu ;
	private  Memory memory;
	private  Disk  disk ;
	
	public Computer(CPU cpu,Memory memory,Disk  disk ){
		this.cpu = cpu;
		this.memory = memory;
		this.disk = disk;
		
	}
		
	 public void startup(){  
	        System.out.println("computer  startup!");  
	        cpu.startup();
	        memory.startup();
	        disk.startup();
	    }  
	      
	    public void shutdown(){  
	        System.out.println("computer   shutdown!");
	        cpu.shutdown();
	        memory.shutdown();
	        disk.shutdown();
	    }  
}
