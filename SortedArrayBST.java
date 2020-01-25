package com.vikastadge.algo;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class SortedArrayBST {
    static final int COUNT = 10;
    static void print2DUtil(TreeNode root, int space)
    {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.val + "\n");

        // Process left child
        print2DUtil(root.left, space);
    }
    public static TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (nums.length == 0) return null;
        if (start > end) return null;
        int mid = (start + end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid -1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        int[] input = {-10,-3,0,5,9};
        TreeNode treeNode = sortedArrayToBST(input, 0, input.length-1);
        print2DUtil(treeNode,0);
    }
}
