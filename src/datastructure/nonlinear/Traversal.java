package datastructure.nonlinear;

public class Traversal {
    public static void preOrderTraversal(TreeNode n){
        if (n == null){
            return ;
        }
        System.out.println(n.data);
        preOrderTraversal(n.left);
        preOrderTraversal(n.right);
    }

    public static void postOrderTraversal(TreeNode n){
        if (n == null){
            return ;
        }
        preOrderTraversal(n.left);
        preOrderTraversal(n.right);
        System.out.println(n.data);

    }

    public static void inOrderTraversal(TreeNode n){
        if (n == null){
            return ;
        }
        preOrderTraversal(n.left);
        System.out.println(n.data);
        preOrderTraversal(n.right);

    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        preOrderTraversal(root);
    }
}
