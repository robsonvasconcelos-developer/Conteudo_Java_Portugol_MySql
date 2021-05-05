programa
{
	
	funcao inicio()
	{
	//variaveis
	inteiro valores[5]
	inteiro x=0
	inteiro maior=0

	//Cadastrando os valores e Pontuaçoes
	para (x=0; x<5; x++){
		escreva("Digite 5 valores de 0 a 5: ")
		leia(valores[x])
		
		
	}
		

		para ( x = 0;x<5;x++){
			escreva ("\n",x+1, " = ", valores[x])
				se(valores[x]>maior){
					maior = valores[x]

				
				}

			escreva ( "\n A maior numeração é =  ",maior)

				
		}

		escreva ("\n Fim do Programa!!!!!!")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */