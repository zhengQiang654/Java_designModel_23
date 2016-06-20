package com.zfq.responsity;
/*
 * 迭代器模式
 * 在一个时刻，命令只允许由一个对象传给另一个对象，而不允许传给多个对象
 */
public interface Handler {
	public void operation ();
}
