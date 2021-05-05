programa
{
	inclua biblioteca Util
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
			//Declarando variaveis
		const inteiro vetor=10
		inteiro dadinho[vetor],maiorPonto=0,contador=0,x
		real mediaDePontos=0.00,total=0.00

		 //Processo

		 para (x = 0;x<vetor;x++){
		 	dadinho[x] = Util.sorteia (1, 6)
		 		total += dadinho[x]
		 	se (dadinho[x] > maiorPonto){
		 		maiorPonto = dadinho[x] contador = 1
		 	}
		 	senao se (dadinho[x] == maiorPonto){
		 		contador++
		 	}
		 	escreva("Lançamento: ", (1+1), " - ", dadinho[x], "\n")
		 }

		//Media
		mediaDePontos = total/vetor
		mediaDePontos= mat.arredondar(mediaDePontos, 2)

			//Saidas

			escreva ("\n Média Aritmética: ", mediaDePontos)
			escreva ("\n Maior Pontuação: ", maiorPonto)
			escreva ("\n Ocorrência Maior Pontuação: ", contador)
			escreva ("\n FIM DO PROGRAMA!!!! ")
			
		
	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 851; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */