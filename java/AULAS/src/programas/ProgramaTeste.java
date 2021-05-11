package programas;

 import java.util.Scanner;

import classes.Basico;

 public class ProgramaTeste {

 	public static void main(String[] args) {

 		Scanner leia = new Scanner(System.in);

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

 		//aluno1.cpf = "111"; --- Objeto CPF foi PRIVATIZADO!
 				//aluno1.matricula = 234; --- Objeto matricula foi PRIVATIZADO!
 				
 				
 									//Imprimindo DROM class OBjeto: Estudante!
 				
 				/*Fiz isso, pq criei o GETTERS and Setter, sendo assim, escrevo o
 				 *  OBJETO Aluno1.getCpf*/
 				
 				System.out.println(aluno1.getCpf());
 				
 				
 				/*
 				 * Ja a opcao aluno1.setCPF("xxx.xxx.xxx-xx") 
 				 * e trocar MANUALMENTE como String!!!
 				 */
 				System.out.println(aluno1.getCpf());
 				

 				// Lendo a NOTA feita em Metodos(Metodo para nao ser alterado!) na CLASS Estudante
 				
 				//Estudante aluno1 = new Estudante(10,"111.222.333-11"); //command + shift + O = IMPORTA O PACOTE. - import classes.Estudante;
 				
 				
 				


 	}

 }
		
		