package com.dsa.tree;

/**
 * 二叉树
 */
public class BinaryTree {


    static class Node {
        int data;
        Node left;
        Node rigth;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRigth() {
            return rigth;
        }

        public void setRigth(Node rigth) {
            this.rigth = rigth;
        }
    }


    /**
     * 前序遍历
     * @param root
     */
    public static void preOrder(Node root) {
        if (root == null) {
            return ;
        }
        System.out.println(root.getData());
        preOrder(root.getLeft());
        preOrder(root.getRigth());
    }

    /**
     * 中序遍历
     * @param root
     */
    public static void inOrder(Node root) {
        if (root == null) {
            return ;
        }
        inOrder(root.getLeft());
        System.out.println(root.getData());
        inOrder(root.getRigth());
    }

    /**
     * 后序遍历
     * @param root
     */
    public static void postOrder(Node root) {
        if (root == null) {
            return ;
        }
        postOrder(root.getLeft());
        postOrder(root.getRigth());
        System.out.println(root.getData());
    }

    public static Node init(){
        Node root = new Node(1);
        Node node11 = new Node(2);
        Node node12 = new Node(3);
        Node node21 = new Node (4);
        Node node22 = new Node(5);
        Node node23 = new Node(6);
        Node node24 = new Node(7);
        Node node31 = new Node(8);
        root.setLeft(node11);
        root.setRigth(node12);
        node11.setLeft(node21);
        node11.setRigth(node22);
        node12.setLeft(node23);
        node12.setRigth(node24);
        node21.setLeft(node31);
        return root;
    }

    public static void main(String[] args) {
        Node root = init();
//        preOrder(root);
//        inOrder(root);
        postOrder(root);
    }
}
