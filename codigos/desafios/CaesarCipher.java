import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class CaeserCipherResult {
	
    public static String caesarCipher(String s, int k) {
		
        int to_change, changed;
        String out = "";
		
        for(int i = 0; i < s.length(); i++) {
			
            to_change = (int) s.charAt(i);
            k = k - ((k / 26) * 26);
			
            if(to_change > 64 && to_change < 91) {
				
                changed = to_change + k;
                if(changed > 90) {
                    changed = 64 + (changed - 90);
                }
				
            }else {
				
                if(to_change > 96 && to_change < 123) {
					
                    changed = to_change + k;
                    if(changed > 122) {
                        changed = 96 + (changed - 122);
                    }
					
                }else {
                    changed = to_change;
                }
				
            }
			
            out += (char)changed;
			
        }
		
        return out;
		
    }
	
}

public class CaesarCipher {
	
    public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
        int n = Integer.parseInt(bufferedReader.readLine().trim());
		
        String s = bufferedReader.readLine();
		
        int k = Integer.parseInt(bufferedReader.readLine().trim());
		
        String result = CaeserCipherResult.caesarCipher(s, k);
		
        bufferedWriter.write(result);
        bufferedWriter.newLine();
		
        bufferedReader.close();
        bufferedWriter.close();
		
    }
	
}