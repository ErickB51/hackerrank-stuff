import java.io.*;
import java.util.*;

interface PerformOperation {
	
	boolean check(int a);
	
}

class MyMath {
	
	public static boolean checker(PerformOperation p, int num) {
		
		return p.check(num);
		
	}
	
    public PerformOperation isOdd() {
		
        return new PerformOperation() {
			
            @Override
            public boolean check(int a) {
				
                return !(a % 2 == 0);
				
            }
			
        };
		
    }
	
    public PerformOperation isPrime() {
		
        return new PerformOperation() {
			
            @Override
            public boolean check(int a) {
				
                int n = 0;
				
                for(int i = 1; i <= a; i++) {
					
                    if(a % i == 0) {
                        n++;
                    }
					
                }
				
                return (n == 2);
				
            }
			
        };
		
    }
	
    public PerformOperation isPalindrome() {
		
        return new PerformOperation() {
			
            @Override
            public boolean check(int a) {
				
                String x = "" + a;
				
                for(int i = 0; i < x.length() / 2; i++) {
					
                    if(x.charAt(i) != x.charAt((x.length() - 1) - i)) return false;
					
                }
				
                return true;
				
            }
			
        };
		
    }
	
}

public class LambdaExpressions {

	public static void main(String[] args) throws IOException {
		
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		
		while(T--> 0) {
			
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			if(ch == 1) {
				
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
				
			}else if(ch == 2) {
				
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
				
			}else if(ch == 3) {
				
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
				
			}
			
			System.out.println(ans);
			
		}
		
	}
	
}