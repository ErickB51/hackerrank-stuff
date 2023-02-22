import java.io.*;
import java.util.*;

public class DequeChallenge {
	
    public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
		
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
		
        int n, m, i, input, unique_count, removed;
		
        n = in.nextInt();
        m = in.nextInt();
		
        unique_count = 0;
        in.nextLine();
		
        for(i = 0; i < n; i++) {
			
            input = in.nextInt();
			
            deque.add(input);
            set.add(input);
			
            if(deque.size() >= m) {
				
                if(set.size() > unique_count) {
					
                    unique_count = set.size();
					
                }
				
                removed = deque.remove();
				
                if(!deque.contains(removed)) {
					
                    set.remove(removed);
					
                }
				
            }
			
        }
		
        System.out.println(unique_count);
		
    }
	
}