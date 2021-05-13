package POO;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Colecoes_MapaAluno {
	
	// MAP e uma estrutura, que conseguimos recuperar os dados
	//do Aluno, informando apenas o seu nome
	//como argmento de um Metodo.
	
	public static void main(String args[]) {
		
		Map<String,Colecoes_Aluno> mapa = new TreeMap<String,Colecoes_Aluno>();
		
		Colecoes_Aluno a= new Colecoes_Aluno("Cristiano Ronaldo", "JAVA", 6.8);
		Colecoes_Aluno b= new Colecoes_Aluno("Bianca", "Macintosh", 7.8);
		Colecoes_Aluno c= new Colecoes_Aluno("Leticia", "Linux", 8.8);
		Colecoes_Aluno d= new Colecoes_Aluno("Mary", "Python", 5.5);
		
		// Recuperando o Parametro!!!
		
		mapa.put("Cristiano Ronaldo", a);
		mapa.put("Bianca", b);
		mapa.put("Leticia", c);
		mapa.put("Mary", d);
		
		System.out.println(mapa);
		
		// para recuperar o OBJETO especifico, UTILIZO o Get
		// tem que informar o PARAMETRO que funciona como CHave
		
		System.out.println(mapa.get("Cristiano Ronaldo"));
		
		//instanciando a COLLECTION
		Collection<Colecoes_Aluno> alunos = mapa.values();
		
		//Loop FOR para percorrer=
		for(Colecoes_Aluno e:alunos)
		{
			System.out.println(e);
		}
		
		
		
	}

}
