import java.io.*;
import java.util.*;

public class ArrayListChallenge {
	
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer>[] al = new ArrayList[sc.nextInt()];
        sc.nextLine();
        
        for(int i = 0; i < al.length; i++) {
			
            int size = sc.nextInt();
			
            al[i] = new ArrayList<>();
			
            for(int j = 0; j < size; j++) {
				
                int elemento = sc.nextInt();
                al[i].add(elemento);
				
            }
			
            sc.nextLine();
			
        }
        
        int ops = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < ops; i++) {
			
            int line = sc.nextInt();
            int pos = sc.nextInt();
			
            try {
				
                System.out.println(al[line - 1].get(pos - 1));
				
            }catch(IndexOutOfBoundsException npe) {
				
                System.out.println("ERROR!");
				
            }
			
            if(sc.hasNextLine()) {
				
                sc.nextLine();
				
            }
			
        }
		
    }
	
}