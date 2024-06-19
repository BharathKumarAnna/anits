package trees;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BSTinsert {

    TreeNode root;

    BSTinsert() {
        root = null;
    }

    void insert(int key) {
        root = insertRecursive(root, key);
    }

    TreeNode insertRecursive(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }

        if (key < root.val)
            root.left = insertRecursive(root.left, key);
        else if (key > root.val)
            root.right = insertRecursive(root.right, key);

        return root;
    }

    void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder Traversal of BST before insertion:");
        bst.inorderTraversal(bst.root);

        int newValue = 45;
        bst.insert(newValue);

        System.out.println("\nInorder Traversal of BST after inserting " + newValue + ":");
        bst.inorderTraversal(bst.root);
    }
}
