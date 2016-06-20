package com.zfq.test;

import java.sql.SQLException;

import com.zfq.flyWeight.ConnectionPool;

public class FlyWeightTest {

	public static void main(String[] args) throws SQLException {
		ConnectionPool instance = new ConnectionPool();
		System.out.println("ha");
		
	}

}
