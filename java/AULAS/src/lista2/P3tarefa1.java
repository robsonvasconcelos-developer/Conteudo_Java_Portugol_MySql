package lista2;

import java.util.Scanner;

public class P3tarefa1 {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
	
		
		//Variaveis
				int idade;

			//Entradas
				System.out.println("digite sua idade de 10 a 25 anos : ");
				idade = leia.nextInt();
			
			//Processos

			if (idade >= 10 && idade <= 14){
				System.out.println(" Voce esta na classificacao ETARIA INFANTIL ");
			}
			else if (idade >= 15 && idade <= 17){
				System.out.println(" Voce esta na classificacao ETARIA JUVENIL ");
				}
	
				
			else if (idade >= 18 && idade <= 25){
				System.out.println(" Voce esta na classificacao ETARIA ADULTO ");
				}
		
				

	
		
		
		
		
		

	}

}
