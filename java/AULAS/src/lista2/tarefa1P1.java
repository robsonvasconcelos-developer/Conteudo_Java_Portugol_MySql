package lista2;

import java.util.Scanner;

public class tarefa1P1 {

	public static void main(String[] args) {
		//1) Faça um programa que receba três inteiros e diga qual deles é o maior.

		
		int n1,n2,n3;
		
	// entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero INTEIRO : ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero INTEIRO : ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro numero INTEIRO : ");
		n3 = leia.nextInt();
		
		if(n1 >  n2 && n1 > n3) {
			System.out.printf(" O maior Numero digitado e: %d ", n1 );
		}
		else if(n2 >  n1 && n2 > n3) {
			System.out.printf(" O maior Numero digitado e: %d ", n2 );
		}
		else if(n3 >  n1 && n3 > n2) {
			System.out.printf(" O maior Numero digitado e: %d ", n3 );
		}
		
	}

}
