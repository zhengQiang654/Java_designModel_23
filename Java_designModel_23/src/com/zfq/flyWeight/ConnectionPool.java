package com.zfq.flyWeight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.StringTokenizer;
import java.util.Vector;

public class ConnectionPool {
	/*公有属性*/
	private String url = "jdbc:mysql://localhost:3306/test";
	private String name = "root";
	private String password = "mengna";
	private String DriverClass = "com.mysql.jdbc.Driver";
	
	private Vector<Connection> pool ;
	private ConnectionPool instance = null;
	private int sise = 100;
	private Connection conn = null;
	
/*	构造函数，做一些初始化工作*/
//	数据库连接池的基本原理
//	享元模式
	public ConnectionPool() throws SQLException {
		 pool = new Vector<Connection>(sise);
		for (int i = 0; i < 100; i++) {
			try {
				Class.forName(DriverClass);
				Connection connectiuon = DriverManager.getConnection(url,name, password);
				pool.addElement(connectiuon);
				System.out.println("2");
				System.out.println(pool.elements());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
/*	将数据库连接返回连接池 ， 会并发访问，需要同步*/
	public  synchronized void realease(){
		pool.addElement(conn);
		
	}
//	从数据库连接池中获取链接
	public synchronized Connection getConection(){
		if (pool.size() > 0) {
			Connection  conn = pool.get(0);
			 pool.removeElement(conn);
			 return  conn ;
		}
		return null;
	}
	
}
