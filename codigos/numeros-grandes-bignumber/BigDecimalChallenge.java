import java.io.*;
import java.util.*;
import java.math.BigDecimal;

public class BigDecimalChallenge {
	
    public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
		
        String key;
        String[] array;
		
        int n = in.nextInt();
        array = new String[n];
		
        in.nextLine();
		
        for(int i = 0; i < n; i++) {
			
            array[i] = in.nextLine();
			
            key = array[i];
			
            if(i > 0) {
				
                int j = i;
				
                while(j-- > 0 && new BigDecimal(array[j]).compareTo(new BigDecimal(key)) < 0) {
					
                    array[j + 1] = array[j];
					
                }
				
                array[j + 1] = key;
				
            }
			
        }
		
        for(int i = 0; i < n; i++) {
			
            System.out.print(array[i].toString());
			
            if(i < n - 1) {
				
                System.out.println();
				
            }
			
        }
		
    }
	
}