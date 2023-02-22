import java.io.*;
import java.util.*;

public class StringReverse {
	
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        String res = isPalindrome(sc.next()) ? "Yes" : "No";
		
        System.out.println(res);
		
    }
	
    public static boolean isPalindrome(String s) {
		
        for(int i = 0, j = s.length() - 1; i < (s.length() / 2); i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
				
                return false;
				
            }
			
        }
		
        return true;
		
    }
	
}