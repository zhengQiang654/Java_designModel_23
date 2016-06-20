package com.zfq.composite;

import java.util.Enumeration;
import java.util.Vector;

import lombok.Getter;
import lombok.Setter;

public class TreeNode {
	@Getter @Setter
	private String name ;
	@Getter @Setter
	private TreeNode parent ;
	@Getter @Setter
	private Vector<TreeNode> children  = new Vector<TreeNode>();
	
	public TreeNode(String name) {
		this.name = name ;
	}
	public TreeNode() {
		// TODO Auto-generated constructor stub
	}
	//tian'jia hai'zijiedian
	public void add(TreeNode node ){
		children.addElement(node);
	}
	//删除孩子节点
	public void remove(TreeNode node ){
		children.remove(node);
	}
	//获得孩子节点
	public Enumeration<TreeNode> getChildren(){
		return children.elements();
	}
	
}
