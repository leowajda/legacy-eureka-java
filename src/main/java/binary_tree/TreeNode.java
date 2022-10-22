package binary_tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this(val);
        this.left = left;
        this.right = right;
    }

    public static Queue<Integer> serialize(TreeNode root) {
        if (root == null)
            return new LinkedList<>();

        Queue<TreeNode> queue = new LinkedList<>(singletonList(root));
        Queue<Integer> result = new LinkedList<>();

        while (!queue.isEmpty()) {

            TreeNode temp = queue.remove();
            result.add((temp == null) ? null : temp.val);

            if (temp != null) {
                queue.add(temp.left);
                queue.add(temp.right);
            }

        }

        return result;
    }

    public static TreeNode deserialize(Integer... args) {
        Queue<Integer> list = new LinkedList<>(asList(args));

        if (list.isEmpty())
            return null;

        TreeNode root = new TreeNode(list.remove());
        Queue<TreeNode> queue = new ArrayDeque<>(singletonList(root));

        while (!queue.isEmpty()) {

            TreeNode temp = queue.remove();
            Integer leftVal = list.isEmpty() ? null : list.remove();
            Integer rightVal = list.isEmpty() ? null : list.remove();

            temp.left = (leftVal != null) ? new TreeNode(leftVal) : null;
            temp.right = (rightVal != null) ? new TreeNode(rightVal) : null;

            if (temp.left != null)
                queue.add(temp.left);

            if (temp.right != null)
                queue.add(temp.right);
        }

        return root;
    }

    public static boolean equals(TreeNode a, TreeNode b) {

        if (a == null || b == null)
            return a == b;

        return  a.val == b.val         &&
                equals(a.left, b.left) &&
                equals(a.right, b.right);
    }

}
