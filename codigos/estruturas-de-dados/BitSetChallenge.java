import java.io.*;
import java.util.*;

public class BitSetChallenge {
	
    public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
		
        int size = in.nextInt();
		
        BitSet[] bs = new BitSet[2];
        bs[0] = new BitSet(size);
        bs[1] = new BitSet(size);
		
        int ops = in.nextInt();
        in.nextLine();
		
        while(ops > 0) {
			
            String op = in.next();
			
            switch(op) {
				
                case "AND":
				
                    bs[in.nextInt() - 1].and(bs[in.nextInt() - 1]);
                    break;
					
                case "OR":
				
                    bs[in.nextInt() - 1].or(bs[in.nextInt() - 1]);
                    break; 
					
                case "XOR":
				
                    bs[in.nextInt() - 1].xor(bs[in.nextInt() - 1]);
                    break;
					
                case "SET":
				
                    bs[in.nextInt() - 1].set(in.nextInt());
                    break;
					
                case "FLIP":
				
                    bs[in.nextInt() - 1].flip(in.nextInt());
                    break;
					
            }
			
            System.out.println(bs[0].cardinality() + " " + bs[1].cardinality());
			
            ops--;
			
            if(in.hasNextLine()) {
				
                in.nextLine();
				
            }
			
        }
		
    }
	
}