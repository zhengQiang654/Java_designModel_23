package com.zfq.test;

import java.util.Vector;

import org.junit.validator.PublicClassValidator;
//组合模式， 常用语树形结构，表示部分与整体的关系
import com.zfq.composite.TreeNode;

public class CompasiteTest {
	private static  TreeNode root = null;
	public static void main(String args []){
		root = new TreeNode();
		root.setName("root");
		Vector<TreeNode> tree = new Vector<TreeNode>();
		tree.addElement(new TreeNode("children1"));
		tree.addElement(new TreeNode("children2"));
		root.setChildren(tree);
		
	}
}
