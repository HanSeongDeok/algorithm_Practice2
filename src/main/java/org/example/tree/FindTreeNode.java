package org.example.tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class FindTreeNode implements FindMethod{
    private final TreeNode treeNode;
    private final List<Integer> list = new ArrayList<>();;
    public FindTreeNode(TreeNode treeNode){
        this.treeNode = treeNode;
    }
    @Override
    public List<Integer> findInOrder() {
        list.clear();
        return findInOrderNode(treeNode);}
    @Override
    public List<Integer> findPreOrder() {
        list.clear();
        return findPreOrderNode(treeNode);
    }
    @Override
    public List<Integer> findPostOrder() {
        list.clear();
        return findPostOrderNode(treeNode);
    }

    private List<Integer> findInOrderNode(TreeNode treeNode){
        if (treeNode == null) {
            return null;
        }
        findInOrderNode(treeNode.getLeftNode());
        list.add(treeNode.getVar());
        findInOrderNode(treeNode.getRightNode());
        return list;
    }

    private List<Integer> findPreOrderNode(TreeNode treeNode){
        if (treeNode == null) {
            return null;
        }
        list.add(treeNode.getVar());
        findPreOrderNode(treeNode.getLeftNode());
        findPreOrderNode(treeNode.getRightNode());
        return list;
    }

    private List<Integer> findPostOrderNode(TreeNode treeNode){
        if (treeNode == null) {
            return null;
        }
        findPreOrderNode(treeNode.getLeftNode());
        findPreOrderNode(treeNode.getRightNode());
        list.add(treeNode.getVar());
        return list;
    }

    public static void main(String[] args) {

    }
}
