package LacoParaFacaEnmquanto;

import java.util.Locale;
import java.util.Scanner;

public class P1_Enquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos 
		 * e apresente no final o total do somatório, a média e o total de valores
		 *  lidos. O programa deve fazer as leituras dos valores enquanto o usuário 
		 *  estiver fornecendo valores positivos. Ou seja, o programa deve parar quando
		 *   o usuário fornecer um valor negativo.

		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		

		int valor=0;
		int totalSoma=0;
		int media=0;
		int totalLido=0;

		System.out.println("Escreva até que valor deseja, efetuar a contagem: ");
		valor = leia.nextInt();

		if (valor <= 0){
			System.out.println("\nValor invalido na contagem!!!");
		}
		while (valor>0){
			System.out.printf("\nA contagem até o numero digitado é %d :", valor);
			valor = valor - 1;
			totalSoma = totalSoma + valor;
			
			
			}
		
			
		
			System.out.printf("\ntotal de soma: %d ", totalSoma);

			media = totalSoma / 2;
			System.out.printf("\nA media do total, considerando o valor digitado é de: %d ", media);

			


		
		
	}

}
