import java.util.Locale;
import java.util.Scanner;

public class P6_Programacao_Sequencial {

	public static void main(String[] args) {
		// 6. Construa um programa em c que, tendo como dados de entrada
		//dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva
		//a distância entre eles. A fórmula que efetua tal cálculo é: 

		
		Scanner ler = new Scanner(System.in); //Instanciar o Teclado.
		
		//Declarando as Variaveis
		
		Locale.setDefault(Locale.US);
		double x1;
		double y1;
		double x2;
		double y2;
		double dist;
		
		// entrada de dados
		
		System.out.println("Sabendo o seu ponto (x1,y1), escreva o seu x1  : ");
		x1 = ler.nextInt();
		
		System.out.println("Sabendo o seu ponto (x1,y1), escreva o seu x2  : ");
		y1 = ler.nextInt();
		
		System.out.println("Sabendo o seu ponto (x1,y1), escreva o seu y2  : ");
		x2 = ler.nextInt();
		
		System.out.println("Sabendo o seu ponto (x1,y1), escreva o seu y2  : ");
		y2 = ler.nextInt();
		
		//Calculo em PORTUGOl= 
		//Biblioteca
		//inclua biblioteca Matematica -->
		
		//dist = mat.raiz((mat.potencial(x2-x1,2.0)+mat.potencial(y2-y1,2.0)), 2.0)
		
		/*Explicacao do ED
		math.sqrt();
		math.pow(valor,2);
		*/
		
	
		
		
		dist = Math.pow((Math.pow(x2-x1,2.0)+ Math.pow(y2-y1,2.0)), 2.0);
		
		
		//saida
		System.out.println(dist);
		
		
		
	}

}
