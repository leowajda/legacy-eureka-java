package binary_tree.recursive;

import binary_tree.TreeNode;

public class LC_0104 {
    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
