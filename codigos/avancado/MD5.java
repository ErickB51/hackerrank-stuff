import java.io.*;
import java.util.*;
import java.security.*;
import java.math.*;

public class MD5 {
    
    public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        String toEncrypt = in.nextLine();
		
        try {
			
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(toEncrypt.getBytes());
			
            BigInteger numRep = new BigInteger(1,messageDigest);
            String hash = numRep.toString(16);
			
            while(hash.length() < 32) {
				
                hash = "0" + hash;
				
            }
			
            System.out.println(hash);
			
        }catch(NoSuchAlgorithmException nsae) {
			
            throw new RuntimeException(nsae);
			
        }finally {
			
            in.close();
			
        }
		
    }
	
}