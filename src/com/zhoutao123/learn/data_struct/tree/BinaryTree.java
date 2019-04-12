package com.zhoutao123.learn.data_struct.tree;

import com.zhoutao123.learn.data_struct.utils.TreeTraverseUtil;

/** 二叉树的手动实现以及三种便利方式 */
public class BinaryTree {

  public static void main(String[] args) {
    TreeNode<String> rootNode = new TreeNode<>("Root");

    // 构建根节点的左右
    TreeNode<String> leftTreeNode = new TreeNode<>("RootLeftNode");
    TreeNode<String> rightTreeNode = new TreeNode<>("RootRightNode");

    // 创建左节点的子节点
    TreeNode<String> node1 = new TreeNode<>("1");
    TreeNode<String> node2 = new TreeNode<>("2");
    leftTreeNode.setLeftNode(node1).setRightNode(node2);

    // 创建右节点的子节点
    TreeNode<String> node3 = new TreeNode<>("3");
    TreeNode<String> node4 = new TreeNode<>("4");
    rightTreeNode.setRightNode(node3).setLeftNode(node4);

    rootNode.setRightNode(rightTreeNode).setLeftNode(leftTreeNode);

    // 前序遍历
    System.out.println("-----前序遍历------");
    TreeTraverseUtil.preTraverseBinaryTree(rootNode);
    System.out.println("-----中序遍历------");
    TreeTraverseUtil.inTraverseBinaryTree(rootNode);
  }
}
