import java.io.*;
import java.util.*;

public class HashSetChallenge {
	
    public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        Set<String> s = new HashSet<>();
		
        int qntd_inputs = in.nextInt();
        in.nextLine();
		
        while(qntd_inputs-- > 0) {
			
            s.add(in.nextLine());
            System.out.println(s.size());
			
        }
		
    }
	
}