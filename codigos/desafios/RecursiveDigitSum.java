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

class RecursiveDigitSumResult {

    public static int superDigit(String n, int k) {
		
        if(n.length() == 1 && k == 1) {
            return Integer.parseInt(n);
        }else {
            long number = superDigitAux(n, n.length() - 1) * k;   
            return superDigit(String.format("%d", number), 1);
        }
		
    }
    
    public static long superDigitAux(String n, int index) {
		
        if(index == 0) {
            return Character.getNumericValue(n.charAt(index));
        }else {
            return Character.getNumericValue(n.charAt(index))+superDigitAux(n,index - 1);
        }
    }
	
}

public class RecursiveDigitSum {
	
    public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = RecursiveDigitSumResult.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
	
}