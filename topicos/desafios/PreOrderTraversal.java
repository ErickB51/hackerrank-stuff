import java.util.*;
import java.io.*;

class NodeTraversal {

    NodeTraversal left;
    NodeTraversal right;
    int data;

    NodeTraversal(int data) {
		
        this.data = data;
        left = null;
        right = null;
		
    }
	
}

class PreOrderTraversal {

    public static void preOrder(NodeTraversal root) {
		
        System.out.print(root.data + " ");
		
        if(root.left != null) {
            preOrder(root.left);
        }
		
        if(root.right != null) {
            preOrder(root.right);
        }
		
    }

    public static NodeTraversal insert(NodeTraversal root, int data) {
		
        if(root == null) {
			
            return new NodeTraversal(data);
			
        }else {
			
            NodeTraversal cur;
			
            if(data <= root.data) {
				
                cur = insert(root.left, data);
                root.left = cur;
				
            }else {
				
                cur = insert(root.right, data);
                root.right = cur;
				
            }
			
            return root;
			
        }
		
    }

    public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
        int t = scan.nextInt();
        NodeTraversal root = null;
		
        while(t-- > 0) {
			
            int data = scan.nextInt();
            root = insert(root, data);
			
        }
		
        scan.close();
		
        preOrder(root);
		
    } 
	
}