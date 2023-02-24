import java.io.*;
import java.util.*;

public class StackChallenge {
	
    public static void main(String[] args) {
		
        Stack<Character> stack;
		
        Scanner sc = new Scanner(System.in);
		
        while(sc.hasNext()) {
			
            String s = sc.nextLine();
			
            if(s.equals("")) {
				
                System.out.println("true");
				
            }else {
				
                stack = new Stack<>();
				
                for(int i = 0; i < s.length(); i++) {
					
                    switch(s.charAt(i)){
						
                        case '{':
						
                            stack.push(s.charAt(i));
                            break;
							
                        case '(':
						
                            stack.push(s.charAt(i));
                            break;
							
                        case '[':
						
                            stack.push(s.charAt(i));
                            break;
							
                        case '}':
						
                            if(!stack.empty()) {
								
                                if(stack.peek() == '{') {
									
                                    stack.pop();
									
                                }else {
									
									stack.push('!');
									
								}
								
                            }else {
								
                                stack.push('!');
								
                            }
                            break;
                        
                        case ')':
						
                            if(!stack.empty()) {
								
                                if(stack.peek() == '(') {
									
                                    stack.pop();
									
                                }else {
									
									stack.push('!');
									
								}
								
                            }else {
								
                                stack.push('!');
								
                            }
                            break;
                            
                        case ']':
						
                            if(!stack.empty()) {
								
                                if(stack.peek() == '[') {
									
                                    stack.pop();
									
                                }else {
									
									stack.push('!');
									
								}
								
                            }else {
								
                                stack.push('!');
								
                            }
                            break;
							
                    }
					
                }
				
                System.out.println(stack.empty());
				
            }
			
        }
		
    }
	
}