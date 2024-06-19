package trees;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

 class BSTsearch {

    TreeNode root;

    BSTsearch() {
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

    boolean search(int key) {
        return searchRecursive(root, key);
    }

    boolean searchRecursive(TreeNode root, int key) {
        if (root == null)
            return false;
        if (root.val == key)
            return true;
        if (key < root.val)
            return searchRecursive(root.left, key);
        else
            return searchRecursive(root.right, key);
    }

    public static void main(String[] args) {
    	BSTsearch bst = new BSTsearch();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        int keyToSearch = 60;
        if (bst.search(keyToSearch))
            System.out.println(keyToSearch + " found in BST.");
        else
            System.out.println(keyToSearch + " not found in BST.");
    }
}

