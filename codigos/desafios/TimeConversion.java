import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class TimeConversionResult {
    
    public static String timeConversion(String s) {
        
        int i, hh, mm, ss, n=0;
        String[] time = {"", "", "", ""};
        
        for(i = 0; i < s.length(); i++) {
			
            if(s.charAt(i) == ':') {
                n++;
            }else {
				
                if(s.charAt(i) == 'A' || s.charAt(i) == 'P') {
					
                    n++;
                    time[n] += s.charAt(i);
					
                }else {
					
                    time[n] += s.charAt(i);
					
                }
				
            }
			
        }
        
        hh = Integer.parseInt(time[0]);
        mm = Integer.parseInt(time[1]);
        ss = Integer.parseInt(time[2]);
        
        if(time[3].equals("PM")) {
			
            if(hh < 12) {
                hh += 12;
            }
            
        }else {
            
            if(hh >= 12) {
                hh -= 12;
            }
            
        }

        return String.format("%02d:%02d:%02d",hh,mm,ss);
		
    }

}


public class TimeConversion {
	
    public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = TimeConversionResult.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
		
    }
	
}