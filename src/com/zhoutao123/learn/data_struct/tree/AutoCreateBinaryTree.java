package com.zhoutao123.learn.data_struct.tree;

import com.zhoutao123.learn.data_struct.utils.TreeTraverseUtil;

/** 根据数组自动创建搜索二叉树 */
public class AutoCreateBinaryTree {

  public static void main(String[] args) {
    Integer[] intData = {10,9,11,8,4,6,100,3,45,123,54,12,45};
    // 创建根节点
    TreeNode<Integer> root = new TreeNode<>(intData[0]);
    for (int i = 1; i < intData.length; i++) {
      int element = intData[i];
      createSearchTree(root, element);
    }
    System.out.println("---------中序遍历该二叉树------");
      TreeTraverseUtil.inTraverseBinaryTree(root);
  }

  public static void createSearchTree(TreeNode<Integer> rootNode, Integer value) {
    TreeNode<Integer> tempNode = rootNode;
    while (tempNode != null) {
      // 当前插入节点小于给定节点，向左走
      if (value < tempNode.getValue()) {
        // 判断其左节点是否存在节点，如果不存在，直接插入
        // 如果存在左节点，那么直接到左节点中去
        if (tempNode.getLeftNode() == null) {
          tempNode.setLeftNode(new TreeNode<>(value));
          return;
        } else {
          tempNode = tempNode.getLeftNode();
        }

      } else {
          // 如果给定的值大于或等于给定节点的值，那么向右走
          // 如果右节点为NULL，那么直接创建,否则，将其右节点重新设置新的节点，再次循环
          if(tempNode.getRightNode() == null){
              tempNode.setRightNode(new TreeNode<>(value));
              return;
          }else{
              tempNode = tempNode.getRightNode();
          }
      }
    }
  }
}
