package trees;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BSTpostorder {

    TreeNode root;

    BSTpostorder() {
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

    void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.val + " ");
        }
    }

    public static void main(String[] args) {
    	BSTpostorder bst = new BSTpostorder();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Postorder Traversal of BST:");
        bst.postorderTraversal(bst.root);
    }
}
