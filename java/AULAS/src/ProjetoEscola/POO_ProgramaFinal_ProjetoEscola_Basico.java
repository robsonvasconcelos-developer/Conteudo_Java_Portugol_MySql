package ProjetoEscola;

//package programas;
//package classes;

//package ProjetoEscola;

import java.util.Locale;
import java.util.Scanner;

import classes.Basico;
public class POO_ProgramaFinal_ProjetoEscola_Basico {

	public static void main(String[] args) {
				
		//int matricula = 5020,a,numero=0;
				String /*cpf = "000.000.000-00"*/b, tipo [] = {"Basico","Médio","Graduação","Pós","Mestrado"};
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
						System.out.print("Digite o nome do aluno? ");
				 		String nome = leia.next().toUpperCase();
				 		System.out.print("Digite o numero da matricula :");
				 		int matricula = leia.nextInt();
				 		System.out.print("Digite o cpf :");
				 		String cpf = leia.next();
				 		System.out.print("Digite o dia de aniversário :");
				 		int dia = leia.nextInt();
				 		System.out.print("Digite a nota inicial:");
				 		double nota = leia.nextDouble();

				 		Basico aluno1 = new Basico(matricula,cpf,dia); //instanciando o objeto

				 		aluno1.setNome(nome);
				 		aluno1.adicionarNota(nota);
				 		System.out.printf("Pontos atuais do aluno %s = %.0f \n",aluno1.getNome(),aluno1.getPontos());
				 		System.out.println("Digite o dia atual :");
				 		int diaAtual = leia.nextInt();
				 		aluno1.bonusAniversario(diaAtual);
				 		System.out.printf("Pontos após método do aluno %s = %.0f\n ",aluno1.getNome(),aluno1.getPontos());

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
				}
					
					 while (opcao!='6');
						System.out.println("\nFim do programa!!\n");
					
						
		

	}
	
}

				
				
		
	


