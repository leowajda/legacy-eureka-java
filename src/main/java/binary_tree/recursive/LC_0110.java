package binary_tree.recursive;

import binary_tree.TreeNode;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class LC_0110 {
    public boolean isBalanced(TreeNode root) {
        return helper(root) != -1;
    }

    private int helper(TreeNode root) {
        if (root == null)
            return 0;

        int left = helper(root.left), right = helper(root.right);
        return (left == -1 || right == -1 || abs(left - right) > 1) ? -1 : max(left, right) + 1;
    }
}
