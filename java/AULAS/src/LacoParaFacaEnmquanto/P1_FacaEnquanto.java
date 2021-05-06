package LacoParaFacaEnmquanto;

import java.util.Locale;
import java.util.Scanner;

public class P1_FacaEnquanto {

	public static void main(String[] args) {
		
	/*
	 * 1- Faça um programa que mostre uma contagem na tela
	 *  de 233 a 456, só que contando de 3 em 3 quando estiver
	 *   entre 300 e 400 e de 5 em 5 quando não estiver.
	
	 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		//DECLARANDO VARIAVEIS
				int n = 0;

			//Entrada de Dados na Variaveis
				System.out.println("Informe um numero INTEIRO entre 233 a 456: ");
				n  = leia.nextInt();

			//Processamento do LOOP
				do {
					if (n >=300 && n <=400){
						n = (n + 5);
						System.out.printf("\n",n);
					}
					if (n>=233 && n <300 || n >400 && n < 456);{
						n = (n + 3);
						System.out.printf("\n",n);
					}
					
				}
						while (n>=233 && n <456);
							if (n <233 || n >456);{
							System.out.printf("Este numero nao atende a regra entre 233 a 456");
						}
				

				
		
	
		
		
		

	}

}
