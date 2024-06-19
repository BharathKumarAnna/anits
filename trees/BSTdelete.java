package trees;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BSTdelete {

    TreeNode root;

    BSTdelete() {
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

    TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return root;

        if (key < root.val)
            root.left = deleteNode(root.left, key);
        else if (key > root.val)
            root.right = deleteNode(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.val = minValue(root.right);
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    int minValue(TreeNode root) {
        int minVal = root.val;
        while (root.left != null) {
            minVal = root.left.val;
            root = root.left;
        }
        return minVal;
    }

    void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
    	BSTdelete bst = new BSTdelete();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder Traversal of BST before deletion:");
        bst.inorderTraversal(bst.root);
        System.out.println();

        int keyToDelete = 30;
        bst.root = bst.deleteNode(bst.root, keyToDelete);

        System.out.println("Inorder Traversal of BST after deleting " + keyToDelete + ":");
        bst.inorderTraversal(bst.root);
    }
}

