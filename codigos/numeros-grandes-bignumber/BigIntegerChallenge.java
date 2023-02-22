import java.io.*;
import java.util.*;
import java.math.*;

public class BigIntegerChallenge {
	
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        String fstIn = sc.next();
        String sndIn = sc.next();
		
        BigInteger fstNum = new BigInteger(fstIn);
        BigInteger sndNum = new BigInteger(sndIn);
		
        System.out.println(fstNum.add(sndNum).toString());
        System.out.println(fstNum.multiply(sndNum).toString());
		
    }
	
}