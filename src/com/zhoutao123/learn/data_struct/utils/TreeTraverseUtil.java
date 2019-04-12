package com.zhoutao123.learn.data_struct.utils;

import com.zhoutao123.learn.data_struct.tree.TreeNode;

public class TreeTraverseUtil {

  /**
   * 私有化构造方法，防止外部创建实例
   *
   * <p>抛出异常，防止内部创建该实例</>
   */
  private TreeTraverseUtil() {
    throw new IllegalStateException("工具类不建议创建实例对象");
  }

  /**
   * 前序迭代遍历
   *
   * @param treeNode
   */
  public static void preTraverseBinaryTree(TreeNode treeNode) {
    if (treeNode != null) {
      System.out.println(treeNode.getValue());
      preTraverseBinaryTree(treeNode.getLeftNode());
      preTraverseBinaryTree(treeNode.getRightNode());
    }
  }

  /**
   * 中序迭代遍历
   *
   * @param treeNode
   */
  public static void inTraverseBinaryTree(TreeNode treeNode) {
    if (treeNode != null) {
      inTraverseBinaryTree(treeNode.getLeftNode());
      System.out.println(treeNode.getValue());
      inTraverseBinaryTree(treeNode.getRightNode());
    }
  }
}
