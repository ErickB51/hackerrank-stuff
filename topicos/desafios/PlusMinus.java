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

class PlusMinusResult {

	public static void plusMinus(List<Integer> arr) {
	
        int i, n, pos = 0, neg = 0, zer = 0;
		
        for(i = 0; i < arr.size(); i++) {
			
            n = arr.get(i);
			
            if(n > 0) pos++;
            if(n < 0) neg++;
            if(n == 0) zer++;
			
        }
		
        System.out.printf("%.6f%n",(float)pos/arr.size());
        System.out.printf("%.6f%n",(float)neg/arr.size());
        System.out.printf("%.6f%n",(float)zer/arr.size());
		
    }
	
}

public class PlusMinus {
	
    public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        PlusMinusResult.plusMinus(arr);

        bufferedReader.close();
    }
	
}