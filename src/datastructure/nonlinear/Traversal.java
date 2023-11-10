package datastructure.nonlinear;

public class Traversal {
    public static void preOrderTraversal(Node n){
        if (n == null){
            return ;
        }
        System.out.println(n.data);
        preOrderTraversal(n.left);
        preOrderTraversal(n.right);
    }

    public static void postOrderTraversal(Node n){
        if (n == null){
            return ;
        }
        preOrderTraversal(n.left);
        preOrderTraversal(n.right);
        System.out.println(n.data);

    }

    public static void inOrderTraversal(Node n){
        if (n == null){
            return ;
        }
        preOrderTraversal(n.left);
        System.out.println(n.data);
        preOrderTraversal(n.right);

    }
    public static void main(String[] args){
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(2);

        preOrderTraversal(root);
    }
}
