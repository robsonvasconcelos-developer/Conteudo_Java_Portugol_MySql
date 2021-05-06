package Lacos_de_Repeticao16_do_while_for;

import java.util.Locale;
import java.util.Scanner;

public class P5_do_While {

	public static void main(String[] args) {
		
		/*Problema = 5 - )Crie um programa que leia um número do teclado
		 *  até que encontre um número igual a zero. No final, mostre 
		 *  a soma dos números digitados.(DO...WHILE)
		 */

		
		
		//estrutura de START
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		
		int n;
		int soma=0;
		
		
		
		do {
			System.out.println("\nInforme um numero INTEIRO : ");
			n  = leia.nextInt();
			
			soma = soma + n;
		} while (n != 0);
		
		System.out.printf("soma = %d", soma);
		
		

	}

}
