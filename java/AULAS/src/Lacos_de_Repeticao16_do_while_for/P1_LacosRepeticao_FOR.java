package Lacos_de_Repeticao16_do_while_for;

import java.util.Locale;
import java.util.Scanner;

public class P1_LacosRepeticao_FOR {

	public static void main(String[] args) {
		
		
		/* 1-)Informar todos os números de 1000 a 1999 que quando 
		 * divididos por 11 obtemos resto = 5. (FOR)
*/
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		//Declarando Variaveis
		
		int n;
		
	
		
		/*System.out.printf("Informe Todos os números de 1000 a 1999, que quando dividido por  11, o resto sera 5 :  ");
		n  = leia.nextInt();*/
		
		//processamento de dados 
		
		for (n=1000; n<=1999; n++) {
			if (n % 11== 5) {
				System.out.println(n);
			}
					
		}
		
		
		
			
		
		
		
		
		
		
		
	}

}
