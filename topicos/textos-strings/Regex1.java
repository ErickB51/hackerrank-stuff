import java.io.*;
import java.util.*;
import java.util.regex.*;

class MyRegex {
	
    public static final Pattern PATTERN = Pattern.compile("(0[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]|[0-9][0-9]|[0-9])\\.(0[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]|[0-9][0-9]|[0-9])\\.(0[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]|[0-9][0-9]|[0-9])\\.(0[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]|[0-9][0-9]|[0-9])");
	
}

public class Regex1 {
	
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        while(sc.hasNextLine()) {
			
            String actual = sc.nextLine();
			
            Matcher m = MyRegex.PATTERN.matcher(actual);
            System.out.println(m.matches());
			
        }
		
    }
	
}