package POO;

public class Interface_ParticipanteForum implements Interface_Leitor,Interface_Programador {
	
	String pensamento;
	public String lendo()
	{
		return "Forum";
	}
	
	public void pensando(char[] ideias)
	{
		pensamento = new String (ideias);
		
	}
	
	public String digitando()
	{
		return pensamento;
		
	}
	
	private String aprendendo()
	{
		return "JAVA";
	}

	
	
	

}
