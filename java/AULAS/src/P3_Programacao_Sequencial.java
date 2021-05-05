import java.util.Scanner;

public class P3_Programacao_Sequencial {

	public static void main(String[] args) {
		// 3. Faça um sistema que leia o tempo de duração de um evento em uma
		//fábrica expressa em segundos e mostre-o expresso em horas,
		//minutos e segundos. 

		
		
		//Declarando Variaveis
		
		int tempoDuracao=0,horas=0,minutos=0,segundos=0;
		
		//entradas de Dados
				
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o tempo do evento em segundos: ");
		tempoDuracao = ler.nextInt();
		
		//Processamento de Dados
		horas = (tempoDuracao / 3600 );
        minutos = (tempoDuracao % 3600) / 60;
        segundos = (tempoDuracao % 3600) % 60;

        System.out.println("Hora(s): "+horas+"\n");
        System.out.println("Minuto(s): "+minutos+"\n");
        System.out.println("Segundo(s): "+segundos+"\n");
		
		
		
		
		
	}

}
