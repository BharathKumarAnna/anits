package trees;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BSTdepth {

    TreeNode root;

    BSTdepth() {
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

    int findDepth(TreeNode root) {
        if (root == null)
            return 0;
        else {
            int leftDepth = findDepth(root.left);
            int rightDepth = findDepth(root.right);

            // Return the maximum of left and right subtree depths, plus 1 for the current level
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    public static void main(String[] args) {
        BSTdepth bst = new BSTdepth();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        int depth = bst.findDepth(bst.root);
        System.out.println("Depth of the BST: " + depth);
    }
}

