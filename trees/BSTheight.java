package trees;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BSTheight{

    TreeNode root;

    BSTheight() {
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

    int height(TreeNode root) {
        if (root == null)
            return -1; // Height of an empty tree is -1

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
    	BSTheight bst = new BSTheight();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        int treeHeight = bst.height(bst.root);
        System.out.println("Height of the BST: " + treeHeight);
    }
}
