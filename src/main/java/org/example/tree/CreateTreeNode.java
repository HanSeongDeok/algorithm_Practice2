package org.example.tree;

import java.util.Optional;

public class CreateTreeNode {
    int[] treeNodeValue;
    final int START_INDEX = 0;
    public CreateTreeNode(int[] treeNodeValue) {
        this.treeNodeValue = treeNodeValue;
    }
    public TreeNode getTree(){
        return addValue(START_INDEX);
    }
    private TreeNode addValue(int index){
        if (index >= treeNodeValue.length || treeNodeValue[index] == -1) {
            return null;
        }
        TreeNode root = new TreeNode(treeNodeValue[index]);
        root.setLeftNode(addValue(2 * index + 1));
        root.setRightNode(addValue(2 * index + 2));

        return root;
    }
    public static void main(String[] args) {
        int [] treeValue = {3, 1, 4, 3, -1, 1, 5};
        CreateTreeNode createTreeNode = new CreateTreeNode(treeValue);
        TreeNode root = createTreeNode.getTree();

        FindMethod find = new FindTreeNode(root);
        System.out.println("InOrder");
        find.findInOrder().stream().forEach(integer -> System.out.println(integer));
        System.out.println("PreOrder");
        find.findPreOrder().stream().forEach(integer -> System.out.println(integer));
        System.out.println("PostOrder");
        find.findPostOrder().stream().forEach(integer -> System.out.println(integer));
    }
}
