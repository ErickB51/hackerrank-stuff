import java.io.*;
import java.util.*;


class QueueWithStacks<T> {
    
    private Stack<T> add = new Stack<>();
    private Stack<T> get = new Stack<>();
    
    public void enqueue(T element) {
        add.push(element);
    }
    
    public void dequeue() throws EmptyStackException {
		
        if(get.isEmpty()) {
			
            while(!add.isEmpty()) {
                get.push(add.pop());
            }
			
        }
		
        get.pop();
		
    }
    
    public T front() throws EmptyStackException {
		
        if(get.isEmpty()) {
			
            while(!add.isEmpty()) {
                get.push(add.pop());
            }
			
        }
		
        return get.peek();
		
    }
    
}

public class QueueUsingTwoStacks {

    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));   
        QueueWithStacks<Integer> queue = new QueueWithStacks<>();
        
        int cases, op_id, element;
        String[] tokens;
        
        cases = Integer.parseInt(input.readLine());
        
        while(cases-- > 0){
            
            tokens  = input.readLine().split(" ");
            op_id   = Integer.parseInt(tokens[0]);
            
            switch(op_id){
                
                case 1:
				
                    element = Integer.parseInt(tokens[1]);
                    queue.enqueue(element);
                    break;
					
                case 2:
				
                    queue.dequeue();
                    break;
					
                case 3:
				
                    System.out.println(queue.front());
                    break;
                    
            }
            
        }
        
    }
	
}