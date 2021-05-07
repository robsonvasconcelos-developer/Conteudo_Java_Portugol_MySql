programa
{
	
	funcao inicio()
	{
	cadeia times [] = {"São Paulo", "Santos", "Palmeiras", "Corinthians"}
		inteiro pontos [4]
		caracter resultado

		para(inteiro rodada = 0; rodada <3 ; rodada++){
			escreva("\n-------RODADA ", rodada+1, "------\n")
		 para(inteiro x=0; x < 4; x++) {
			escreva("\nJogo ", times[x], " Digite G-ganhou, P-perdeu, E-empate: ")
			leia(resultado)
			se(resultado == 'G'){
				pontos[x] = pontos[x]+3
			} senao se(resultado =='P'){
				pontos[x] = pontos[x]+0
			} senao se(resultado == 'E'){
				pontos[x] = pontos[x]+1
			}
			}
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 571; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */