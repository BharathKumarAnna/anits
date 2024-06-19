package trees;
//BST level order using Queues.
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BSTlevelorder {

    public static TreeNode buildTreeLevelOrder(Integer[] nodes) {
        if (nodes == null || nodes.length == 0 || nodes[0] == null)
            return null;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(nodes[0]);
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (i < nodes.length && nodes[i] != null) {
                node.left = new TreeNode(nodes[i]);
                queue.add(node.left);
            }
            i++;

            if (i < nodes.length && nodes[i] != null) {
                node.right = new TreeNode(nodes[i]);
                queue.add(node.right);
            }
            i++;
        }

        return root;
    }

    public static void printTree(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");

            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] nodes = {1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8};
        TreeNode root = buildTreeLevelOrder(nodes);
        System.out.println("Constructed Tree (Level Order):");
        printTree(root);
    }
}

