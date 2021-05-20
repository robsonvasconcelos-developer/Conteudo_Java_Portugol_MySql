package POO;
// ESSE e o programa FInal da CLASS chamada "Pessoa"
public class Nome {
	public static void main (String args[])
	{
		// Classe: Pessoa --- pesooa1 = OBBJETO ---- 
		/*COLOCANDO= Pessoa pessoa1 = new Pessoa("Maria","Antonia", Oliveira); - 
		 * Colocar os parametros nas ASPAS como String!!! Abaixo segue exemplo
		 * com 3 PARAMETROS*/
		
		Pessoa pessoa1 = new Pessoa("Maria","Antonia","Oliveira");
		System.out.println(pessoa1.getNomeCompleto());
		// Printar e chamar o OBJETO:"pessoa1" com PONTO chamar o METODO:".getNomeCompleto()"
		
	}

}
