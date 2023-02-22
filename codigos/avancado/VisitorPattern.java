import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

enum Color {
	
    RED, GREEN
	
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
		
        this.value = value;
        this.color = color;
        this.depth = depth;
		
    }
	
    public int getValue() {
        return value;
    }
	
    public Color getColor() {
        return color;
    }
	
    public int getDepth() {
        return depth;
    }
	
    public abstract void accept(TreeVis visitor);
	
}

class TreeNode extends Tree {
	
    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
		
        visitor.visitNode(this);

        for (Tree child : children) {
			
            child.accept(visitor);
			
        }
		
    }

    public void addChild(Tree child) {
        children.add(child);
    }
	
}

class TreeLeaf extends Tree {
	
    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }
	
    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
	
}

abstract class TreeVis {
	
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
	
    private int result = 0;
	
    public int getResult() {
        return result;
    }
	
    public void visitNode(TreeNode node) {
    }
	
    public void visitLeaf(TreeLeaf leaf) {
        this.result += leaf.getValue();
    }
	
}

class ProductOfRedNodesVisitor extends TreeVis { 

    private long result = 1;
    private int mod = 1000000007;
	
    public int getResult() {
        return (int)(this.result % this.mod);
    }
	
    public void visitNode(TreeNode node) {
		
        if(node.getColor() == Color.RED){
            this.result = (this.result * node.getValue()) % mod;
        }
		
    }
	
	public void visitLeaf(TreeLeaf leaf) {
		
		if(leaf.getColor() == Color.RED){
			this.result = (this.result * leaf.getValue()) % mod;
		}
		
	}
	
}
	
class FancyVisitor extends TreeVis {
	
	private int result = 0;
	
	public int getResult() {
		return Math.abs(this.result);
	}
	
	public void visitNode(TreeNode node) {
		if(node.getDepth() % 2 == 0) this.result += node.getValue();
	}
	
	public void visitLeaf(TreeLeaf leaf) {
		if(leaf.getColor() == Color.GREEN) this.result -= leaf.getValue();
	}
	
}

public class VisitorPattern {
	
    public static Tree solve() {
        
        Scanner in = new Scanner(System.in);
        int n, i, j;
        
        n = in.nextInt();
        in.nextLine();
        
        int[] num_inputs = new int[n];
        Color[] color_inputs = new Color[n];
        Map<Integer, ArrayList<Integer>> edges = new HashMap<Integer, ArrayList<Integer>>();
        
        for(i = 0; i < n; i++) num_inputs[i] = in.nextInt();
        in.nextLine();
        
        for(i = 0; i < n; i++) color_inputs[i] = in.nextInt() == 1 ? Color.GREEN : Color.RED;
        in.nextLine();
        
        while(in.hasNextLine()) {
            
            i = in.nextInt() - 1;
            j = in.nextInt() - 1;
            
            if(edges.get(i) == null) {
                edges.put(i, new ArrayList<Integer>());
            }
            edges.get(i).add(j);
            
            if(edges.get(j) == null) {
                edges.put(j, new ArrayList<Integer>());
            }
            edges.get(j).add(i);
            
            if(in.hasNextLine()) in.nextLine();
			
        }
		
        int root_index = 0;
        Tree root = new TreeNode(num_inputs[root_index], color_inputs[root_index], 0);
		
        for(int child : edges.get(root_index)) {
            
            edges.get(child).remove(new Integer(root_index));
            
            if(edges.get(child).isEmpty()) {
				
                Tree leaf = new TreeLeaf(num_inputs[child],color_inputs[child],root.getDepth() + 1);
                ((TreeNode)root).addChild(leaf);
				
            }else {
				
                Tree node = new TreeNode(num_inputs[child],color_inputs[child],root.getDepth() + 1);
                ((TreeNode)root).addChild(node);
                VisitorPattern.readChilds(edges, num_inputs, color_inputs,child,node);
				
            }
        }
		
        in.close();
        return root;
		
    }

    private static void readChilds(Map <Integer,ArrayList<Integer>> edges, int[] num_inputs, Color[] color_inputs, int root_index, Tree root){
        
        for(int child : edges.get(root_index)) {
            
            edges.get(child).remove(new Integer(root_index));
            
            if(edges.get(child).isEmpty()) {
				
                Tree leaf = new TreeLeaf(num_inputs[child],color_inputs[child],root.getDepth() + 1);
                ((TreeNode)root).addChild(leaf);
				
            }else {
				
                Tree node = new TreeNode(num_inputs[child],color_inputs[child],root.getDepth() + 1);
                ((TreeNode)root).addChild(node);
                VisitorPattern.readChilds(edges, num_inputs, color_inputs,child,node);
				
            }
            
        }
        
    }
	
    public static void main(String[] args) {
		
        Tree root = solve();
		
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
		
    }
	
}