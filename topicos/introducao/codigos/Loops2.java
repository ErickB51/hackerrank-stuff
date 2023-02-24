import java.util.*;
import java.io.*;

public class Loops2 {
	
    public static void main(String []argh) {
		
        Scanner in = new Scanner(System.in);
        
		int t = in.nextInt();
		
        for(int i = 0; i < t; i++){
			
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c = 1;
            int x = 0;
			
            for(int j = 0; j < n; j++, c *= 2) {
				
                if(j == 0) {
					
                    x = a + c * b;
					
                }else {
					
                    x += c * b;
					
                }
				
                System.out.print(x);
				
                if(j < n) {
					
                    System.out.print(" ");
					
                }
				
            }
			
            System.out.println();
			
        }
		
        in.close();
		
    }
	
}