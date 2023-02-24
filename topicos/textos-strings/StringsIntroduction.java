import java.io.*;
import java.util.*;

public class StringsIntroduction {
	
    public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
        String a = sc.next();
        String b = sc.next();
		
        String greaterThan = a.compareTo(b) > 0 ? "Yes" : "No";
		
        System.out.println(a.length() + b.length());
        System.out.println(greaterThan);
        System.out.println(a.substring(0,1).toUpperCase() + a.substring(1,a.length()) + " " + b.substring(0,1).toUpperCase() + b.substring(1,b.length()));
		
	}
}