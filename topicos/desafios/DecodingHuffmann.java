import java.util.*;
 
abstract class Node implements Comparable<Node> {
    
    public  int frequency; // frequência da árvore
    public  char data;
    public  Node left, right; 
    
    public Node(int freq) { 
      frequency = freq; 
    }

	//compara frequência
    public int compareTo(Node tree) {
        return frequency - tree.frequency;
    }
    
}
 
class HuffmanLeaf extends Node {    

    public HuffmanLeaf(int freq, char val) {
        super(freq);
        data = val;
    }
    
}
 
class HuffmanNode extends Node {
    
    public HuffmanNode(Node l, Node r) {
		
        super(l.frequency + r.frequency);
        left = l;
        right = r;
		
    }

}

class Decoding {
    
    void decode(String s, Node root) {
        
        String decodified_string = transverse_tree(s, root, root, 0);
        System.out.println(decodified_string);
		
    }
    
    String transverse_tree(String s, Node root, Node current_node, int current_pos) {
        
        if(current_pos == s.length()) {
			
            if(current_node instanceof HuffmanLeaf){
                return ""+current_node.data;
            }
			
            return "";
			
        }else {
			
            if(current_node instanceof HuffmanLeaf) {
                return current_node.data + transverse_tree(s, root, root, current_pos);
            }else {
				
                if(s.charAt(current_pos) == '0') {
                    return transverse_tree(s, root, current_node.left, current_pos + 1);
                }else {
                    return transverse_tree(s, root, current_node.right, current_pos + 1);
                }
				
            }
			
        }
		
    }
	
}

public class DecodingHuffmann {
  
    // entrada é um array de frequências, indexadas à partir do código do caractere
    public static Node buildTree(int[] charFreqs) {
      
        PriorityQueue<Node> trees = new PriorityQueue<Node>();
        // inicialmente, existe uma floresta de folhas
        // uma para cada caractere não vazio
        for (int i = 0; i < charFreqs.length; i++)
            if (charFreqs[i] > 0)
                trees.offer(new HuffmanLeaf(charFreqs[i], (char)i));
 
        assert trees.size() > 0;
      
        // repete até existir apenas uma árvore restante
        while (trees.size() > 1) {
            // remove as duas árvores com a menor frequência
            Node a = trees.poll();
            Node b = trees.poll();
 
            // usa estas árvores para a criação de um nó huffmann e insere este novo nó na fila de árvores
            trees.offer(new HuffmanNode(a, b));
        }
      
        return trees.poll();
		
    }
	
    public static Map<Character,String> mapA=new HashMap<Character ,String>();
	
    public static void printCodes(Node tree, StringBuffer prefix) {
      
        assert tree != null;
      
        if (tree instanceof HuffmanLeaf) {
			
            HuffmanLeaf leaf = (HuffmanLeaf)tree;
 
            // imprime o caractere, frequência e o código referente ao caractere desta folha
            //System.out.println(leaf.data + "\t" + leaf.frequency + "\t" + prefix);
            mapA.put(leaf.data,prefix.toString());
			
        } else if (tree instanceof HuffmanNode) {
			
            HuffmanNode node = (HuffmanNode)tree;
 
            // percorre a esquerda
            prefix.append('0');
            printCodes(node.left, prefix);
			
            prefix.deleteCharAt(prefix.length() - 1);
            // percorre a direita
            prefix.append('1');
            printCodes(node.right, prefix);
            prefix.deleteCharAt(prefix.length() - 1);
			
        }
		
    }
	
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
    
        String test= input.next();
		
		//pressupõe-se que todos os caracteres que serão lidos possuem um código cujo valor é menor do que 256
        int[] charFreqs = new int[256];
      
        // lê cada caractere e incrementa a frequência deste respectivo caractere
        for (char c : test.toCharArray())
            charFreqs[c]++;
 
        // constrói a árvore
        Node tree = buildTree(charFreqs);
 
        // imprime os resultados
        printCodes(tree, new StringBuffer());
        StringBuffer s = new StringBuffer();
      
        for(int i = 0; i < test.length(); i++) {
            char c = test.charAt(i);
            s.append(mapA.get(c));
        }
      
        //System.out.println(s);
        Decoding d = new Decoding();
        d.decode(s.toString(), tree);

    }
	
}