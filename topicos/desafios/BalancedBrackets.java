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

class BalancedBracketsResult {

    public static String isBalanced(String s) {
    
        int i;
    
        if(s.equals("")) {
            return "YES";
        }
        
        Stack<Character> order_characters = new Stack<>();
        
        for(i = 0; i < s.length(); i++) {
            
            char current_character = s.charAt(i);
            
            switch(current_character){
                
                case '[':
				
                    order_characters.push(current_character);
                    break;
					
                case '{':
				
                    order_characters.push(current_character);
                    break;
					
                case '(':
				
                    order_characters.push(current_character);
                    break;
                    
                case ']':
				
                    if(order_characters.isEmpty()) {
                        return "NO";
                    }else {
						
                        if(order_characters.peek() == '[') {
                            order_characters.pop();
                        }else {
                            return "NO";
                        }
						
                    }
                    break;
					
                case '}':
				
                    if(order_characters.isEmpty()) {
                        return "NO";
                    }else {
						
                        if(order_characters.peek() == '{') {
                            order_characters.pop();
                        }else {
                            return "NO";
                        }
						
                    }
                    break;
					
                case ')':
				
                    if(order_characters.isEmpty()) {
                        return "NO";
                    }else {
						
                        if(order_characters.peek() == '(') {
                            order_characters.pop();
                        }else {
                            return "NO";
                        }
                    }
                    break;
					
            }
            
        }
        
        return order_characters.isEmpty() ? "YES" : "NO";
		
    }
	
}

public class BalancedBrackets {
	
    public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = BalancedBracketsResult.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }catch(IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
		
    }
	
}