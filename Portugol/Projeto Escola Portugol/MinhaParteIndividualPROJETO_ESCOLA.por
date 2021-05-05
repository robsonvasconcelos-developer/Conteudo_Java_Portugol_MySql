programa
{
	inclua biblioteca Util
		inteiro matricula = 5020,a,numero=0
		cadeia cpf = "000.000.000-00",b, tipo [] = {"Basico","Médio","Graduação","Pós","Mestrado"}
		inteiro pontos[1],c
		logico status
	
	funcao inicio()
	{
		/*
		 * PROJETO: ESCOLA - Feito em Grupo : Robson, Guilherme Lopes, Leto, Ana Flávia e Andara
		 */

		//Declarando Variaveis = 
		//variaveis especifica da parte 1 (Robson) tema "Aniversario Basico"
	 	inteiro dataProva[1],d //Ja foi feito o "Escreva 10x"
		real bonusAniversario = 0.10
		inteiro dataNascimento[2],g //Ja foi feito o "Escreva 10x"
		real bonusMaisNota=0.00
		// Entrada
		
		
		/*escreva("Qual foi a sua Pontuação de 0 a 10? \n")
		leia(pontos)
		*/
		
		//Entrada de Dados em Vetores


						//((Front Start))Slogan e Tipo e Niveis de Ensino 

			escreva("-----------------EducaNorte-----------------\n----------Ensinar é o nosso forte ---------- \n")
			escreva("\n--------------------------------------------\n")
			
			caracter opcao

		faca {
			escreva("\nDigite o codigo de sua opção \n")
			escreva("\n1-Basico\n2-Medio\n3-Graduação\n4-Pos\n5-Mestrado\n6-Sair : \n")
			leia(opcao)


			//  TAbela 1 Completa da REGRA DE NEGOCIO - Basico
			se (opcao =='1'){
				limpa()
				escreva("\nENSINO BASICO\n")
				Util.aguarde(1000)

					//Matricula dos Alunes

		para (a=0; a<1 ;a++){
			escreva("\nQual é a matricula do Alunes de 4 Digitos ? ", matricula )
			
			
		}
		para (a=0; a<1 ;a++){
			escreva ("\nA matricula do Alunes é = ",a+1, " : " ,matricula)
		}
			//CPF dos Alunes

	
			escreva("\nQual é o CPF fo Alunes é = ",  cpf)
		
		


		//Data de Nascimento ALUNES

		para (g=0; g<1 ;g++){
			escreva("\nQual sua data de Nascimento Alunes sem (/) [ddmm] apenas dia e Mes ? ")
			leia(dataNascimento[g])
			
		}
		para (g=0; g<1 ;g++){
			escreva ("\nA Data de nascimento do Alunes é = ",g+1, " : " ,dataNascimento[g])
		}

			//dia que foi feito a Prova =
		para (d=0; d<1 ;d++){
			escreva("\nQual o dia e mes da realização do Exame? (/) [ddmm]  ? ")
			leia(dataProva[d])
			
		}
		para (d=0; d<1 ;d++){
			escreva ("\nO exame foi feito em = ",d+1, " : " ,dataProva[d])
			
		}


			// Qual foi a Pontuacao dos ALUNES?


			
			para (c=0; c<1 ;c++){
				escreva("\nQual foi a sua Pontuação de 0 a 10? ")
			leia(pontos[c])
		
			}
			
		
			para (c=0; c<1 ;c++){
			
			escreva (" \n A nota do Alunes sem o bonus foi = ", " : " ,pontos[c])
			}


			
			
			

		//Bonus de 10% de aniversario
			inteiro data1 = dataProva[0]
			inteiro data2 = dataNascimento[0]
			inteiro databonus = pontos[0]
		
		se (data1 == data2){
			bonusMaisNota = bonusAniversario * databonus
		}
			
		
		escreva("\n O bonus do Alune foi de =  ", bonusMaisNota )
			}

			senao {
				escreva("\nFim do programa!!\n")
			}

				
		//fim da Parte de ENSINO BASICO.
			
			se (opcao =='2'){
				limpa()
				escreva("\nENSINO MÉDIO\n")
				Util.aguarde(1000)
			
			}
			senao se (opcao =='3'){
				limpa()
				escreva("\nGRADUAÇÃO\n")
				Util.aguarde(1000)
			}
			senao se (opcao =='4'){
				limpa()
				escreva("\nPos\n")
				Util.aguarde(1000)
			}
			senao se (opcao =='5'){
				limpa()
				escreva("\nMestrado\n")
				Util.aguarde(1000)
			
			}
		} enquanto (opcao!='6')

		escreva("\nFim do programa!!\n")
			

		


		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 455; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */