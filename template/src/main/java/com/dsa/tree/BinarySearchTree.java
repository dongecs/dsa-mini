package com.dsa.tree;

/**
 * 二叉查找树
 */
public class BinarySearchTree {

    static Node root = init();

    static class Node {
        int data;
        Node left;
        Node right;

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

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    public static Node init() {
        Node root = new Node(13);
        Node node11 = new Node(10);
        Node node12 = new Node(16);
        Node node21 = new Node(9);
        Node node22 = new Node(11);
        Node node23 = new Node(14);
        root.setLeft(node11);
        root.setRight(node12);
        node11.setLeft(node21);
        node11.setRight(node22);
        node12.setLeft(node23);
        return root;
    }

    /**
     * 二叉查找树查找指定的数据
     * @param data
     * @return
     */
    public static Node find(int data) {
        Node node = root;
        while (node != null) {
            if (data < node.getData()) {
                node = node.getLeft();
            } else if (data > node.getData()) {
                node = node.getRight();
            } else {
                return node;
            }
        }
        return null;
    }

    /**
     * 二叉搜索树插入
     * @param data
     */
    public static void insert(int data) {

        if (root == null) {
            root = new Node(data);
        }
        Node node = root;
        while (node != null) {
            if (data < node.getData()) {
                if (node.getLeft() == null) {
                    node.setLeft(new Node(data));
                    break;
                }
                node = node.getLeft();
            } else if (data > node.getData()) {
                if (node.getRight() == null) {
                    node.setRight(new Node(data));
                    break;
                }
                node = node.getRight();
            }else {
                break;
            }
        }
    }

    /**
     * 二叉树搜索树删除节点 TODO 有点bug
     * @param data
     */
    public static void delete(int data) {
        Node node = root;
        while (node != null) {
            if (data < node.getData()) {
                node = node.getLeft();
            } else if (data > node.getData()) {
                node = node.getRight();
            } else {
                // 若删除的节点为叶子节点
                if (node.getLeft() == null && node.getRight() == null) {
                    node = null;
                    // 若删除节点只有左节点为空
                } else if (node.getRight() == null && node.getLeft() != null) {
                    node = node.getLeft();
                    // 若删除节点只有右节点为空
                } else if (node.getLeft() == null && node.getRight() != null) {
                    node = node.getRight();
                    //若删除的节点左右子节点均不为空
                } else if (node.getLeft() != null && node.getRight() != null) {

                    //查找右子树最小值，作为删除后替换的节点
                    Node rnode = node.getRight();
                    Node pnode = rnode;
                    while (rnode != null) {
                        if (rnode.getLeft() != null) {
                            pnode = rnode;
                            rnode = rnode.getLeft();
                        } else {
                            rnode.setLeft(node.getLeft());
                            rnode.setRight(node.getRight());
                            pnode.setLeft(null);
                            node = rnode;
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

    /**
     * 中序遍历，既升序输出
     */
    public static void inOrder(Node node) {
        if (node == null) {
            return ;
        }
        inOrder(node.getLeft());
        System.out.print(node.getData() + " ");
        inOrder(node.getRight());
    }

    public static void main(String[] args) {
//        Node node = find(9);
//        System.out.println(node == null ? "not found" : node.getData());
//        insert(8);
        delete(14);
        inOrder(root);
    }
}
