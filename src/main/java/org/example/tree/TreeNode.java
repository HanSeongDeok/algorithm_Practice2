package org.example.tree;

public class TreeNode {
    private int val;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode() {}
    public TreeNode(int var){
        this.val = var;
    }
    public TreeNode(int var, TreeNode leftNode, TreeNode rightNode) {
        this.val = var;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getVal() {
        return val;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString(){
        return String.valueOf(val);
    }
}
