import java.io.*;
import java.util.*;

public class ListChallenge {
	
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        List<Integer> l = new ArrayList();
		
        int qntd_elementos, qntd_op, pos, elemento, i; 
		
        String op;
		
        qntd_elementos = sc.nextInt();
		
        sc.nextLine();
		
        for(i = 0; i < qntd_elementos; i++) {
			
            l.add(sc.nextInt());
			
        }
		
        sc.nextLine();
		
        qntd_op = sc.nextInt();
		
        sc.nextLine();
		
        for(i = 0; i < qntd_op; i++) {
			
            op = sc.nextLine();
			
            if(op.equalsIgnoreCase("insert")) {
				
                pos = sc.nextInt();
                elemento = sc.nextInt();
                l.add(pos,elemento);
				
            }
			
            if(op.equalsIgnoreCase("delete")) {
				
                pos = sc.nextInt();
                l.remove(pos);
				
            }
			
            if(sc.hasNextLine()) {
				
                sc.nextLine();
				
            }
			
        }
		
        for(int e : l) {
			
            System.out.print(e);
			
            if(l.indexOf(e) < l.size() - 1) {
				
                System.out.print(" ");
				
            }
			
        }
		
    }
	
}