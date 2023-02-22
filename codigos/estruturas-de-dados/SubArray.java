import java.io.*;
import java.util.*;

public class SubArray {
	
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        int i, j, cnt = 0, qntd_elementos;
		
        qntd_elementos = sc.nextInt();
		
        int[] array = new int[qntd_elementos];
		
        sc.nextLine();
		
        for(i = 0; i < qntd_elementos; i++) {
			
            array[i] = sc.nextInt();
			
        }
		
        int tamanho_atual = 1;
		
        while(tamanho_atual <= qntd_elementos) {
			
            for(i = 0; i < qntd_elementos - (tamanho_atual - 1); i++) {
				
                int soma = 0;
				
                for(j = i; j < i + tamanho_atual; j++) {
					
                    soma += array[j];
					
                }
				
                if(soma < 0) {
					
                    cnt++;
					
                }
				
            }
			
            tamanho_atual++;
			
        }
		
        System.out.println(cnt);
		
    }
	
}