package POO;

public class TesteInterface {

	public static void main(String[] args) {
		
		//Instanciando o OBJETO: participante
		
		Interface_ParticipanteForum participante = new Interface_ParticipanteForum();
		Interface_Leitor leitor = participante;
		
		System.out.println("O participante esta lendo: "+leitor.lendo());
		Interface_Programador programador = participante;
		String java= "JAVA";
		programador.pensando(java.toCharArray());
		System.out.println(" E programando: " + programador.digitando());
		
		
		
		
	}

}
