programa
{
	inclua biblioteca Matematica
	funcao inicio()
{
//variaveis
inteiro a
inteiro b
inteiro c

//entradas
escreva ("Digite o valor da variavel a: ")
leia(a)
escreva ("Digite o valor da variavel b: ")
leia(b)
escreva ("Digite o valor da variavel c: ")
leia(c)

//processamento
real r = Matematica.potencia((a +b),2)
real s = Matematica.potencia((b +c),2)
real d = (a +b)/2

//saida
escreva ("Para os inteiros positivos"+a+ ", "+b+ "e" + c+ "o valor de d e"+d+ "\n")
escreva ("O valor de r e " +r+ "e de s e"+ s+ "\n")
escreva ("O valor de d e " + d)

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 563; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */