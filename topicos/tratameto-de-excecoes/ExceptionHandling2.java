import java.io.*;
import java.util.*;

public class ExceptionHandling2 {
	
    public static void main(String[] args) {
		
        try {
			
            Scanner in = new Scanner(System.in);
			
            int x = in.nextInt();
            in.nextLine();
			
            int y = in.nextInt();
            System.out.println(x/y);
			
        }catch(ArithmeticException ae) {
			
            System.out.println(ae);
			
        }catch(InputMismatchException ime) {
			
            System.out.print(ime.getClass().toString().split(" ")[1]);
			
        }
		
    }
	
}