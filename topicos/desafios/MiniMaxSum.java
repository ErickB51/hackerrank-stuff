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

class MiniMaxSumResult {
    
    public static void miniMaxSum(List<Integer> arr) {
        
        int i, j;
        long min = 0, max = 0, aux = 0;
        
        for(i = 0; i < arr.size(); i++) {
			
            aux = 0;
			
            for(j = 0; j < arr.size(); j++) {
                if(j != i)  aux += arr.get(j);
            }
			
            if(i == 0){
				
                min = aux;
                max = aux;
				
            }else {
				
                if(aux > max) max = aux;
                if(aux < min) min = aux;
				
            }
			
        }
        
        System.out.println(min + " " + max);

    }
	
}

public class MiniMaxSum {
	
    public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        MiniMaxSumResult.miniMaxSum(arr);

        bufferedReader.close();
		
    }
	
}