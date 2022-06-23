package BinaryTree;

public class ExecBinaryTree {
    public static void main(String[] args) {
        BinaryTree Tree = new BinaryTree();

        Tree.root = new Node(1);
        Tree.root.left = new Node(2);
        Tree.root.left = new Node(3);
        Tree.root.left.left = new Node(4);
    }
}
