import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
import java.security.*;

public class ReflectionAPI2 {
	
    public static void main(String[] args) throws Exception {
		
        DoNotTerminate.forbidExit();
		
        try {
			
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
            int num = Integer.parseInt(br.readLine().trim());
            Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
			
            Inner in = new Inner();
            Class<?> c = Class.forName("Solution$Inner$Private");
            Constructor<?> ctor = c.getDeclaredConstructor(Inner.class);
            Method m = c.getDeclaredMethod("powerof2",int.class);
			
            ctor.setAccessible(true);
            m.setAccessible(true);
            
			o = ctor.newInstance(in);
			
            System.out.println(num + " is " + m.invoke(o,num));
			System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
        
        }
        
        catch (DoNotTerminate.ExitTrappedException e) {
			
            System.out.println("Unsuccessful Termination!!");
			
        }
		
    }
	
	static class Inner {
	
        private class Private {
			
            private String powerof2(int num){
				
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
				
            }
			
        }
		
    }
	
}

class DoNotTerminate { //This class prevents exit(0)
     
    public static class ExitTrappedException extends SecurityException {
		
        private static final long serialVersionUID = 1L;
		
    }
 
    public static void forbidExit() {
		
        final SecurityManager securityManager = new SecurityManager() {
			
            @Override
            public void checkPermission(Permission permission) {
				
                if (permission.getName().contains("exitVM")) {
					
                    throw new ExitTrappedException();
					
                }
            }
        };
		
        System.setSecurityManager(securityManager);
		
    }
	
}