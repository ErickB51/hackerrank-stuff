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

class LonelyIntegerResult {
    
    public static int lonelyinteger(List<Integer> a) {
    
        int i;
        ArrayList<Integer> arr = new ArrayList<>();
    
        for(i = 0; i < a.size(); i++) {
			
            if(arr.indexOf(a.get(i)) == -1) {
				
                arr.add(a.get(i));
				
            }else {
				
                arr.remove(a.get(i));
				
            }
			
        }
        
        return arr.get(0);
        
    }
	
}

public class LonelyInteger {
	
    public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = LonelyIntegerResult.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
		
    }
	
}