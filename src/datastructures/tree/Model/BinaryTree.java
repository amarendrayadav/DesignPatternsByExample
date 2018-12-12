package datastructures.tree.Model;

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public void printGivenLevel(TreeNode root, int level) {
        // method to print nodes at level recursively
        if (root == null)
            return;
        if (level == 1) {
            System.out.println(root.data + " ");
        } else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    private void traverseBFS() {
        int height = getHeight(this.root);
        int i = 1;
        while (i <= height) {
            printGivenLevel(root, i++);
        }
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int lHeight = getHeight(root.left);
            int rHeight = getHeight(root.right);
            /* use the larger one */
            return lHeight > rHeight ? (lHeight + 1) : (rHeight + 1);
        }
    }

    public static void main(String[] args) {
        final BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        System.out.println("Level order traversal of binary tree is ");
        tree.traverseBFS();
    }
}
