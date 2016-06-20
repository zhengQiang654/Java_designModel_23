package com.zfq.strategy;

//定义了一系列的算法， 并将算法封装起来，使他们可以相互的调用， 切算法的调用不会影响带客户的使用
public interface ICaculator {
	public double  caculate(double a, double b);
}
