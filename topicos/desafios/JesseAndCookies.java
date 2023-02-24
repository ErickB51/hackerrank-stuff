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

class JesseAndCookiesResult {

    public static int cookies(int k, List<Integer> A) {
        
        Queue<Integer> cookies = new PriorityQueue<>(A);
        
        int first_cookie, second_cookie, combined_cookie_sweetness = -1, ops_number = 0;
        
        while(cookies.size() > 1 && cookies.peek() < k) {
            
            first_cookie = cookies.poll();
            second_cookie = cookies.poll();
            
            combined_cookie_sweetness = first_cookie + 2 * second_cookie;
            cookies.offer(combined_cookie_sweetness);
            
            ops_number++;
            
        }
        
        return cookies.peek() >= k ? ops_number : -1;
		
    }
	
}

public class JesseAndCookies {
	
    public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = JesseAndCookiesResult.cookies(k, A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
		
    }
	
}