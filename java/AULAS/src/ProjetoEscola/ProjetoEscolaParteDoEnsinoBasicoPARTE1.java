package ProjetoEscola;

import java.util.Locale;
import java.util.Scanner;

public class ProjetoEscolaParteDoEnsinoBasicoPARTE1 {

	public static void main(String[] args) {
		int matricula = 5020,a,numero=0;
		String cpf = "000.000.000-00",b, tipo [] = {"Basico","Médio","Graduação","Pós","Mestrado"};
		int pontos [] = new int [1],c;
		boolean status;
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		/*
		 * PROJETO: ESCOLA - Feito em Grupo : Robson, Guilherme Lopes, Leto, Ana Flávia e Andara
		 */

		//Declarando Variaveis = 
		//variaveis especifica da parte 1 (Robson) tema "Aniversario Basico"
	 	int dataProva [] = new int [1],d; //Ja foi feito o "Escreva 10x"
		double bonusAniversario = 0.10;
		int dataNascimento [] = new int [2],g; //Ja foi feito o "Escreva 10x"
		double bonusMaisNota=0.00;
		// Entrada
		
		
		/*escreva("Qual foi a sua Pontuação de 0 a 10? \n")
		leia(pontos)
		*/
		
		//Entrada de Dados em Vetores


						//((Front Start))Slogan e Tipo e Niveis de Ensino 

		System.out.println("-----------------EducaNorte-----------------\n----------Ensinar é o nosso forte ---------- \n");
		System.out.println("\n--------------------------------------------\n");
			
			char opcao;

		do {
			System.out.println("\nDigite o codigo de sua opção \n");
			System.out.println("\n1-Basico\n2-Medio\n3-Graduação\n4-Pos\n5-Mestrado\n6-Sair : \n");
			opcao = leia.next().toUpperCase().charAt(0);


			//  TAbela 1 Completa da REGRA DE NEGOCIO - Basico
			if (opcao =='1'){
				//limpa();
				System.out.println("\nENSINO BASICO\n");
				//Util.aguarde(1000);

					//Matricula dos Alunes

		for (a=0; a<1 ;a++){
			System.out.printf("\nQual é a matricula do Alunes e = "+ matricula );
			
			
		}
		/*for (a=0; a<1 ;a++){
			System.out.printf("\nA matricula do Alunes é = ",a+1, " : " +matricula);
		}*/
			//CPF dos Alunes

	
		System.out.printf("\nQual é o CPF fo Alunes é = "+  cpf);
		
		


		//Data de Nascimento ALUNES

		for (g=0; g<1 ;g++){
			System.out.println("\nQual sua data de Nascimento Alunes sem (/) [ddmm] apenas dia e Mes ? ");
			dataNascimento[g] = leia.nextInt();
			
		}
		for (g=0; g<1 ;g++){
			System.out.printf("\nA Data de nascimento do Alunes é = "/*,g+1, " : "*/ +dataNascimento[g]);
		}

			//dia que foi feito a Prova =
		for (d=0; d<1 ;d++){
			System.out.println("\nQual o dia e mes da realização do Exame? (/) [ddmm]  ? ");
			dataProva[d] = leia.nextInt();
			
		}
		for (d=0; d<1 ;d++){
			System.out.printf("\nO exame foi feito em = "/*,d+1, " : "*/ +dataProva[d]);
			
		}


			// Qual foi a Pontuacao dos ALUNES?


			
			for (c=0; c<1 ;c++){
				System.out.println("\nQual foi a sua Pontuação de 0 a 10? ");
				pontos[c] = leia.nextInt();
		
			}
			
		
			for (c=0; c<1 ;c++){
			
				System.out.printf(" \n A nota do Alunes sem o bonus foi =  " + pontos[c]);
			}


			
			
			

		//Bonus de 10% de aniversario
			int data1 = dataProva[0];
			int data2 = dataNascimento[0];
			int databonus = pontos[0];
		
		if(data1 == data2){
			bonusMaisNota = bonusAniversario * databonus;
			System.out.printf("\n O bonus do Alune foi de =  " + bonusMaisNota );
		}
			
		else if(data1 != data2) {
			System.out.printf("\n Alunes NAO tem direito ao acrescimo de Bonus!!!!");
		}
		
			}

			else {
				System.out.println("\nFim do programa!!\n");
			}

				
		//fim da Parte de ENSINO BASICO.
			
			if (opcao =='2'){
				//limpa()
				System.out.println("\nENSINO MÉDIO\n");
				//Util.aguarde(1000)
			
			}
			else if (opcao =='3'){
				//limpa()
				System.out.println("\nGRADUAÇÃO\n");
				//Util.aguarde(1000)
			}
			else if (opcao =='4'){
				//limpa()
				System.out.println("\nPos\n");
				//Util.aguarde(1000)
			}
			else if (opcao =='5'){
				//limpa()
				System.out.println("\nMestrado\n");
				//Util.aguarde(1000)
			
			}
		} while (opcao!='6');

		System.out.println("\nFim do programa!!\n");

	}

}
