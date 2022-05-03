package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class YT_Binary {
        static class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        static class BinaryTree {
            static int idx = -1;
            public static Node buildTree(int nodes[]) {
                idx++;
                if(nodes[idx] == -1) {
                    return null;
                }
                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);
                return newNode;
            }
        }

        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }


    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr == null) {
                System.out.println();
                //queue empty
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data+" ");
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static int countofNodes(Node root){
            if(root == null){
                return 0;
            }

            int left_nodes = countofNodes(root.left);
            int right_nodes = countofNodes(root.right);

            return 1 + left_nodes + right_nodes;
      }

      public static int sumofnodes(Node root){
            if(root == null){
                return 0;
            }

            int left_sum = sumofnodes(root.left);
            int right_sum = sumofnodes(root.right);
             return left_sum + right_sum + root.data;
      }

      public static int height(Node root){
            if(root == null){
                return 0;
            }

            int leftheight = height(root.left);
            int rightheight = height(root.right);

            int myheight = Math.max(leftheight , rightheight ) +1;
            return myheight;
      }

    public static void main(String args[]) {
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
            System.out.println(height(root));
        }

    }

