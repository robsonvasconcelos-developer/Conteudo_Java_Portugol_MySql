import java.util.Scanner;

public class P7_Programacao_Sequencial {
	

	public static void main(String[] args) {
		// 7. Um sistema de equações lineares do tipo: 
		//, pode ser resolvido segundo mostrado abaixo : 
			   
		//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e 
		//mostra os valores de x e y. 


		//Declarando Variaveis
		
		int a,b,c,d = 0,r = 0,s = 0;
		
		// Entrada de dados
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor da variavela a: ");
		a = ler.nextInt();
		
		System.out.println("Digite o valor da variavela b: ");
		b = ler.nextInt();
		
		System.out.println("Digite o valor da variavela c: ");
		c = ler.nextInt();
		
		//processamento 
		
		//COMANDOS em Portugol:
		//		real r = Matematica.potencia((a + b), 2)
		//real s = Matematica.potencia((b +c),2)
		//real d = (r +s)/2

		
		//saida
		
		System.out.println("Para os inteiros positivos" + a +","+ b +"e" + c +"o valor de d e"+ d + "\n");
		System.out.println("O valor de r e" + r + "e de s e"+ s + "\n");
		System.out.println("O valor de d e" + d);
		
		
	}

}
