package com.zhoutao123.learn.data_struct.tree;

public class TreeNode<T> {

  private TreeNode<T> leftNode;

  private TreeNode<T> rightNode;

  private T value;

  public TreeNode() {}

    public TreeNode(T value) {
        this.value = value;
    }

    public TreeNode(TreeNode<T> leftNode, TreeNode<T> rightNode, T value) {
    this.leftNode = leftNode;
    this.rightNode = rightNode;
    this.value = value;
  }

  public TreeNode<T> getLeftNode() {
    return leftNode;
  }

  public TreeNode<T> setLeftNode(TreeNode<T> leftNode) {
    this.leftNode = leftNode;
    return this;
  }

  public TreeNode<T> getRightNode() {
    return rightNode;
  }

  public TreeNode<T> setRightNode(TreeNode<T> rightNode) {
    this.rightNode = rightNode;
    return this;
  }

  public T getValue() {
    return value;
  }

  public TreeNode<T> setValue(T value) {
    this.value = value;
    return this;
  }
}
