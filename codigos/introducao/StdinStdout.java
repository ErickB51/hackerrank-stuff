import java.util.*;

public class StdinStdout {
	
    public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
        int a = scan.nextInt();
        System.out.println(a);
		
        a = scan.nextInt();
        System.out.println(a);
		
        a = scan.nextInt();
        System.out.println(a);
		
        scan.close();
		
    }
	
}