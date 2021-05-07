package Lista04_Vetores_e_Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class P2_Input_Vetor {

	public static void main(String[] args) {
		/*
		 * 2- Faça um programa que receba 6 números
		 *  inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		
		// Variaves
		
		int n [] = new int [6];  //Vetor Array com 6 posicoes
		int par=0;
		int impar=0;
		/*
		int nImpar [] = new int [6];  //Vetor Array com 6 posicoes
		int nPar [] = new int [6];  //Vetor Array com 6 posicoes
		*/
		
		
		//PROCESSAMENTO
		
		/*System.out.println("Informe um numero INTEIRO entre 233 a 456: ");
		n  = leia.nextInt();*/
		
		for (int x= 0; x < n.length; x++) {
			System.out.printf("Informe um numero INTEIRO = ", x+1);
			n[x] = leia.nextInt();		
			
			}
		
		System.out.println();
		
		System.out.println( "\nNumeros Pares = ");
		for (int y = 0; y < n.length; y++) {
			if((n[y]%2)==0 && n[y]!=0) {
				System.out.print(n[y]+"\n, ");
				par+=n[y];
				
			}
		}
			
		System.out.println( "\nNumeros impares = ");
		for(int y =0; y<n.length; y++) {
			if(((n[y]%2)==1 || (n[y]%2)==-1) && (n[y]!=0)) {
				System.out.print(n[y]+"\n, ");
				impar +=n[y];
				
			}
		}
			
		
			System.out.printf(" Soma de pares seria de: %d e os impares seria: %d", par, impar);
			
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
