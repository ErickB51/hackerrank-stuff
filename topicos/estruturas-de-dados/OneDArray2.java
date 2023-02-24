import java.io.*;
import java.util.*;

public class OneDArray2 {
	
    public static boolean canWin(int leap, int[] game) {
		
        boolean[] canAccess = new boolean[game.length];
        int aux;
		
        canAccess[0] = true;
		
        for(int i = 0; i < game.length; i++) {
			
            if(canAccess[i] && i + 1 < game.length && game[i + 1] == 0) {
				
                canAccess[i+1] = true;
				
            }
			
            if(canAccess[i] && i + leap < game.length && game[i + leap] == 0) {
				
                canAccess[i + leap] = true;
				
                if(i + leap - 1 > -1 && i + leap - 1 < game.length && game[i + leap - 1] == 0) {
					
                    aux = i + leap - 1;
					
                    while(aux > -1 && aux < game.length && game[aux] == 0) {
						
                        canAccess[aux] = true;
                        aux--;
						
                    }
					
                }
				
            }
			
        }

        for(int i = 0; i < canAccess.length; i++) {
			
            if(canAccess[i]) {
				
                if(i+1 >= canAccess.length) {
					
                    return true;
					
                }
				
                if(i+leap >= canAccess.length) {
					
                    return true;
					
                }
				
            }
			
        }
		
        return false;
		
    }

    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        int q = sc.nextInt();
		
        while(q > 0) {
			
            int size = sc.nextInt();
            int leap = sc.nextInt();
            int[] g = new int[size];
			
            for(int i = 0; i < size; i++) {
				
                g[i] = sc.nextInt();
				
            }
			
            String result = canWin(leap,g) ? "YES" : "NO";
            System.out.println(result);
			
            q--;
        }
		
    }
	
}