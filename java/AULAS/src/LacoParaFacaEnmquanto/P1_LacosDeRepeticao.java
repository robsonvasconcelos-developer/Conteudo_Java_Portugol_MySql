package LacoParaFacaEnmquanto;

import java.util.Locale;
import java.util.Scanner;

public class P1_LacosDeRepeticao {

	public static void main(String[] args) {
		
		
		/*
		 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
		 * coletando dados sobre o salário e número de filhos. A prefeitura deseja 
		 * saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100

		 */
		
		//Estrutura inicial JAVA
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		final int habitantes = 3;
				double salario = 0.00;
				double filhos = 0.00;
				double mediaSalarial = 0.00;
				double totalSalario = 0.00;
				double mediaFilhos = 0.00;
				double totalFilhos = 0.00;
				double maiorSalario = 0.00;
				double percentualSalarioAte100 = 0.00;
				double contadorSalarioAte100 = 0.00;
				int contador = 1;
				
				//Entrada de dados
				
				for (int indice = 1; indice<=habitantes; indice++) {
					
				System.out.println("\nDigite o salario do habitante  : R$ ");
				salario  = leia.nextInt();
				}
				
				for (int indice = 1; indice<=habitantes; indice++) { 
				System.out.println("\nDigite o numero de filhos: ");
				filhos  = leia.nextInt();
				}
				
				totalSalario = totalSalario + salario;
	
				if(salario > maiorSalario) {
					maiorSalario = salario;
				}
	
					if(salario <= 100) {
						contadorSalarioAte100++;
					}
					
					contador++;
		 			if (contador<=habitantes) {
		 				
		 			}
		 				
	
	
					// calculos
	
			mediaSalarial = (totalSalario / habitantes);
			mediaFilhos = (totalFilhos / habitantes);
			percentualSalarioAte100 = (percentualSalarioAte100 / habitantes);
			
			
			//Saidas
			
			System.out.println("\n Media Salarios :R$ %.2f  "+totalSalario);
			System.out.println("\n Media Salarial :R$ %.2f   "+mediaSalarial);
			System.out.println("\n Maior Salario :R$  %.2f  "+maiorSalario);
			
			System.out.println("\n Total de filhos :R$   "+totalFilhos);
			System.out.println("\n Media de filhos :R$   "+mediaFilhos);
			System.out.println("\nPercentual de pessoas com salario ate 100 : " + contadorSalarioAte100 +" % ");
			
			System.out.println("\nFim do Programa");
						
				
				
				
				
				
	}

}
