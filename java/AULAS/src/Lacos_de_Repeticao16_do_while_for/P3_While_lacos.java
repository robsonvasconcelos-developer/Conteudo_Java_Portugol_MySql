package Lacos_de_Repeticao16_do_while_for;

import java.util.Locale;
import java.util.Scanner;

public class P3_While_lacos {

	public static void main(String[] args) {
		
		
		/*
		 * Solicitar a idade de várias pessoas e imprimir:
		 *  Total de pessoas com menos de 21 anos. Total de
		 *   pessoas com mais de 50 anos. O programa termina
		 *    quando idade for =-99. 
		 */
		
		//Estrutura de Configuracao 
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		//Variaveis
		final int PESSOAS =10;
		int contador=1;
		int idade=0;
		char continua ='S';
		int pessoa21=0;
		int pessoa50=0;
		
		
		// entrada de dados =
		
		while (continua=='S' && contador<=PESSOAS) {
 			System.out.printf("Pessoa %d\n",contador);
 			System.out.print("\n Digite a idade : ");
 			idade = leia.nextInt();
 			

 			if(idade<21) {
 				pessoa21++;
 			}

 			if(idade>50) {
 				pessoa50++;
 			}
 			
 			contador++;
 			if (contador<=PESSOAS || idade!=-99)
 				System.out.print("Continua S/N: ");
 				continua = leia.next().toUpperCase().charAt(0);//SIM
 			

 			
 		
 			  
 				
 				
 				System.out.println("\nTotal Pessoas menores de : "+pessoa21);
 				System.out.println("\nTotal Pessoas maiores de : "+pessoa50);
 				System.out.println("FIM DO PROGRAMA!!");
 			}

 		}
	}


