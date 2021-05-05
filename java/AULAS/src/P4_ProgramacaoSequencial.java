
	
import java.util.Scanner;
public class teste1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 4. Escreva  um sistema que leia três números inteiros e 
		 * positivos (A, B, C) e calcule a seguinte expressão: 
 , onde  
*/
				
				Scanner ler = new Scanner(System.in);
				
				int a,b,c;
				
				System.out.println("Digite o valor da variavel a  : ");
				a = ler.nextInt();
				
				System.out.println("Digite o valor da variavel b  : ");
				b = ler.nextInt();
				
				System.out.println("Digite o valor da variavel c  : ");
				c = ler.nextInt();
				
				//processamento
				
				// Em portugol
				/*  real r = Matematica.potencia((a +b),2)
					real s = Matematica.potencia((b +c),2)
					real d = (a +b)/2
					
						/*Explicacao do ED para JAVA
							math.sqrt();
							math.pow(valor,2);
		*/
					
				
						double r = Math.pow((a +b),2);
						double s = Math.pow((b +c),2);
						double d = (a +b)/2;
				
				
					
				//Saida
				
				System.out.println("Para os inteiros positivos " + a + ", "+b+ " e " + c + " o valor de d e " + d + "\n");
				System.out.println("O valor de r e " + r + " e de s e "+ s + "\n");
				System.out.println("O valor de d e " + d);
				

		
		
	}

}
