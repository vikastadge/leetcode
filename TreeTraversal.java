package com.vikastadge.datastructure.tree;

import java.util.Scanner;

public class TreeTraversal {

    public static void inOrderTraversal(Node root) {
        // Write your code here.
        if (root == null){
            System.out.print("");
        }else{
            inOrderTraversal(root.left);
            System.out.print(" "+root.data);
            inOrderTraversal(root.right);
        }
    }

    public static void preTraversal(Node root) {
        // Write your code here.
        if (root == null){
            System.out.print("");
        }else{
            System.out.print(" "+root.data);
            inOrderTraversal(root.left);
            inOrderTraversal(root.right);
        }
    }

    public static void postOrderTraversal(Node root) {
        // Write your code here.
        if (root == null){
            System.out.print("");
        }else{
            inOrderTraversal(root.left);
            inOrderTraversal(root.right);
            System.out.print(" "+root.data);
        }
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        System.out.println("");
        System.out.print("inOrderTraversal :- ");
        inOrderTraversal(root);
        System.out.println("");
        System.out.print("preTraversal :- ");
        preTraversal(root);
        System.out.println("");
        System.out.print("postOrderTraversal :- ");
        postOrderTraversal(root);
    }
}
