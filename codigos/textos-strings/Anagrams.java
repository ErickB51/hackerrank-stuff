import java.io.*;
import java.util.*;

public class Anagrams {
	
    public static boolean isAnagram(String a, String b) {
		
        if(a.length() != b.length()) {
			
            return false;
			
        }
		
        int[] c = new int[26];
		
        for(int i = 0; i < a.length(); i++) {
			
            c[((Character.toLowerCase(a.charAt(i)) - 96) % 27) - 1]++;
			
        }
		
        for(int j = 0; j < b.length(); j++) {
			
            if(c[((Character.toLowerCase(b.charAt(j)) - 96) % 27) - 1] > 0) {
				
                c[((Character.toLowerCase(b.charAt(j)) - 96) % 27) - 1]--;
				
            }else {
				
                return false;
				
            }
			
        }
		
		return true;
		
    }
	
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        String a = sc.next();
        String b = sc.next();
		
        String res = isAnagram(a,b) ? "Anagrams" : "Not Anagrams";
		
        System.out.println(res);
		
    }
	
}