package Trees;

class BinaryNode<T>{
    T data;
    BinaryNode<T> left;
    BinaryNode<T> right;

    public BinaryNode(T data){
        this.data=data;
    }
}
public class Binary{
    public static void main(String[] args) {
        BinaryNode<Integer> root = new BinaryNode<>(15);
        BinaryNode<Integer> Rleft = new BinaryNode<>(10);    //R-> for root node
        BinaryNode<Integer> Rright = new BinaryNode<>(20);

        //Attachment
        root.left = Rleft;
        root.right = Rright;
        Print(root);
    }
    public static void Print(BinaryNode root)
    {
        if(root == null)
            return;
        System.out.println(root.data);
        Print(root.left);
        Print(root.right);
    }
}
