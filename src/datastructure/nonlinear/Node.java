package datastructure.nonlinear;

public class Node {
    public int data;
    protected Node left;
    protected Node right;
    // constructor initialize
    public Node (int data){
        this.data = data;
        this.left = null;
        this.right = null;

    }

//    @Override
//    public String toString(){
//        return "Node: Data " + this.data + " Left: " + this.left + " Right: " + this.right;
//    }
}
