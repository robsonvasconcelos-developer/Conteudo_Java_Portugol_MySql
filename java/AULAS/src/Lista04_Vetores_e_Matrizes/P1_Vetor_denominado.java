package Lista04_Vetores_e_Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class P1_Vetor_denominado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		/*
		 * 1- Faça um programa que possua um vetor
		 *  denominado A que armazene 6 números
		 *   inteiros. O programa deve executar 
		 *   os seguintes passos: 
		 *   
(a) Atribua os seguintes valores a esse
 vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples)
 a soma entre os valores das 
 posições A[0], A[1] e A[5] do vetor e 
 mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a 
esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em 
cada linha.

		 */
		
		//variaveis
		
		int vetorA[] = {1, 0, 5, -2, -5, 7};
		int s=0,x=0;
		
		
		
		/*for (int x : vetorA) {
			System.out.println(x);*/
		
		    for (x=0; x < 6; x++) {
		       
		    	s = s + vetorA[x];
			System.out.println(" A Relacao de numeros Inteiros sao = "+ vetorA[x]);
			
			
		}
		    
		    System.out.println(" A soma total e de = " + s);
		    
		    s+=(vetorA[0]+vetorA[1]+vetorA[5]);
		    
		    System.out.println(s);
		    
		    vetorA[4]=100;
		    
		    		for(int y=0; y<vetorA.length; y++) {
		    			System.out.print(vetorA[y]+"\n= ");
		    		}
		    		
		    
		    
		
		
		
		
		
		
		
		
		
		
	}

}
