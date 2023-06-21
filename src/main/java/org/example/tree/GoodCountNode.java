package org.example.tree;

public class GoodCountNode {
    private int count;
    public void mySolution(TreeNode root){
        System.out.println();
    }

    private int goodCount(TreeNode root ,int max){
        if (root == null) {return 0;}
        if (root.getVar() >= max) {
            count++;
        }
        goodCount(root.getLeftNode(),Math.max(root.getVar(), max));
        goodCount(root.getRightNode(),Math.max(root.getVar(), max));
        return count;
    }

    private int bestCount = 0;
    public void bestSolution(TreeNode root) {
        System.out.println(getBestCount(root, Integer.MIN_VALUE));
    }

    private int getBestCount(TreeNode root, int max){
        if (root == null) {return 0;}

        if (root.getVar() >= max) {
            bestCount ++;
        }
        getBestCount(root.getLeftNode(), Math.max(root.getVar(), max));
        getBestCount(root.getRightNode(), Math.max(root.getVar(), max));
        return bestCount;
    }

    public static void main(String[] args) {
        int[] nodeValue = {3, 1, 4, 3, -1, 1, 5};
        CreateTreeNode createTreeNode = new CreateTreeNode(nodeValue);
        new GoodCountNode().mySolution(createTreeNode.getTree());
        new GoodCountNode().bestSolution(createTreeNode.getTree());
    }
}
