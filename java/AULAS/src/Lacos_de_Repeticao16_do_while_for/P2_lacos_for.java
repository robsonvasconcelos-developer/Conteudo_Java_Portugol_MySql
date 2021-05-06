package Lacos_de_Repeticao16_do_while_for;

import java.util.Locale;
import java.util.Scanner;

public class P2_lacos_for {

	public static void main(String[] args) {
		
		
		/*2) Ler 10 números e imprimir quantos são pares e quantos 
		 * são ímpares. (FOR)
		 */
		
		
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		//Declarando Variaveis
		
		int n, par=0,impar=0, x;
		
		
		
		

		/// Processamento de dados 
		
		for (x=1; x<=10; x++) {
			System.out.printf( x + "-) Digite um numero INTEIRO: ");
			n  = leia.nextInt();
			
			// Contando os Pares
			if(n % 2 == 0) {
				par++;
				
			}
			
			//Contando os Impares
			else {
				impar++;
			}
			
			
		 		
		}
		System.out.printf("\n Pares = %d ", par);
		System.out.printf("\n Impares = %d ", impar);
		
		System.out.printf("\n Fim da Contagem!!! ");


			
		
	}

}
