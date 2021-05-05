package lista2;

import java.util.Scanner;

public class tarefa1P2 {

	public static void main(String[] args) {
		//2) Faça um programa que entre com três números e coloque em ordem crescente.

		
		int n1,n2,n3;
		
	// entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero INTEIRO : ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero INTEIRO : ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro numero INTEIRO : ");
		n3 = leia.nextInt();
		
		if(n1 >=  n2 && n1 >= n3 && n2>=n3) {
			System.out.printf(" Ordem decrescente = ", n1, n2, n3 );
		}
		else if(n1 >=  n2 && n1 >= n3 && n3 >= n2) {
			System.out.printf(" Ordem decrescente = %d %d %d ", n1, n3, n2 );
		}
		else if(n2 >=  n1 && n2 >= n3 && n1 >= n3 ) {
			System.out.printf(" Ordem decrescente = %d %d %d ", n2, n1, n3 );
		}
		else if(n2 >=  n1 && n2 >= n3 && n3 >= n1 ) {
			System.out.printf(" Ordem decrescente = %d %d %d ", n2, n3, n1 );
		}
		else if(n3 >=  n1 && n3 >= n2 && n1 >= n2 ) {
			System.out.printf(" Ordem decrescente = %d %d %d ", n3, n1, n2 );
		}
		else if(n3 >=  n1 && n3 >= n2 && n2 >= n1 ) {
			System.out.printf(" Ordem decrescente = %d %d %d ", n3, n2, n1 );
		}
		
	}

}
