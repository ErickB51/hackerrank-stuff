import java.util.Scanner;

public class TwoDArray {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int[][] ins = new int[6][6];
        
        for(int i=0; i<ins.length; i++) {
			
            for(int j=0; j<ins[i].length; j++) {
				
                ins[i][j] = in.nextInt();
				
            }
			
        }
		
        int biggerSum = 0;
        
        for(int i = 0; i < ins.length - 2; i++) { 
		
            for(int j = 0; j < ins[i].length - 2; j++) {
				
                int tempSum = ins[i][j];
                tempSum += ins[i][j + 1];
                tempSum += ins[i][j + 2];
                tempSum += ins[i + 1][j + 1];
                tempSum += ins[i + 2][j];
                tempSum += ins[i + 2][j + 1];
                tempSum += ins[i + 2][j + 2];
				
                if(i == 0 && j == 0) {
                    biggerSum = tempSum;
					
                }else {
					
                    if(tempSum > biggerSum) {
						
                        biggerSum = tempSum;
						
                    }
					
                }
				
            }
			
        }
        
        System.out.println(biggerSum);
		
    }
	
}