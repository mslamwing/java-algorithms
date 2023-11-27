package datastructure.nonlinear.dfs;

import datastructure.nonlinear.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindLonelyNodesRecursive {

    static List<Integer> result = new ArrayList<>();

    public static List<Integer> getLonelyNodes(TreeNode root) {

        if (root == null) {
            return result;
        }

        if (root.left != null && root.right == null) {
            result.add(root.left.data);
        }

        if (root.left == null && root.right != null) {
            result.add(root.right.data);
        }

        getLonelyNodes(root.left);
        getLonelyNodes(root.right);

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(2);

        System.out.println(getLonelyNodes(root));
    }
}
