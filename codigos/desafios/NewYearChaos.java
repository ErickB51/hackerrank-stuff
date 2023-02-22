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

class NewYearChaosResult {

    public static void minimumBribes(List<Integer> q) {
    
        int i, previous_value, bribes = 0;
        
        for(i = q.size(); i > 0; i--) {
             
            if(q.get(i - 1) != i) {
				
                if(q.get(i - 2) == i) {
                    
                    previous_value = q.get(i - 2);
                    q.set(i - 2, q.get(i - 1));
                    q.set(i - 1, previous_value);
                    
                    bribes++;
                    
                }else {
                    
                    if(q.get(i - 3) == i) {
                        
                        previous_value = q.get(i - 3);
                        q.set(i - 3, q.get(i - 2));
                        q.set(i - 2, previous_value);
                        
                        bribes++;
                        
                        previous_value = q.get(i - 2);
                        q.set(i - 2,q.get(i - 1));
                        q.set(i - 1,previous_value);
                    
                        bribes++;
                        
                    }else {
                        
                        System.out.println("Too chaotic");
                        return;
                        
                    }
                    
                }
                
            }
            
        }
        
        System.out.println(bribes);
		
    }
	
}


public class NewYearChaos {
	
    public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                NewYearChaosResult.minimumBribes(q);
            }catch(IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
		
    }
	
}