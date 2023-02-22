import java.io.*;
import java.util.*;

public class StringTokens {
	
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        String in = sc.nextLine();
        in = in.trim();
		
        if(in.length() == 0 || in.equals("")) {
			
            System.out.println(0);
			
        }else {
			
            String[] out = in.split("[^a-zA-Z]+");
			
            System.out.println(out.length);
			
            for(String s : out) {
				
                System.out.println(s);
				
            }
			
        }
		
    }
	
}