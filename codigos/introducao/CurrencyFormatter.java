import java.util.*;
import java.text.*;

public class CurrencyFormatter {
	
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        double payment = sc.nextDouble();
		
        sc.close();
		
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
		
    }
	
}