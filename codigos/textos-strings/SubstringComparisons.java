import java.io.*;
import java.util.*;

public class SubstringComparisons {
	
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        String s = sc.next();
        int k = sc.nextInt();
		
        String[] out = getSmallestAndLargest(s,k);
		
        System.out.println(out[0]);
        System.out.println(out[1]);
		
    }
    
    public static String[] getSmallestAndLargest(String s, int k) {
		
        String smallest = s.substring(0,k);
        String biggest = smallest;
		
        for(int i = 1; i < s.length() - (k - 1); i++) {
            
			String toCheck = s.substring(i,i+k);
            
			if(toCheck.compareTo(smallest) < 0) {
			   
               smallest = toCheck;
			   
            }
			
            if(toCheck .compareTo(biggest) > 0) {
			   
               biggest = toCheck;
			   
            }
        }
		
        return new String[] {smallest, biggest};
		
    }
	
}