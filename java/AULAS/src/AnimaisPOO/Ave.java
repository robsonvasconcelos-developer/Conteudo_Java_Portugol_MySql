package AnimaisPOO;

public class Ave extends Mamifero implements Pet, Civilizado {


 	public Ave(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
 	public void mamar() {
 		System.out.println("Mamando....");
 	}

 	@Override
 	public void levarVeterinario() {
 		System.out.println("levando pra agulhada....");

 	}

 	@Override
 	public void treinar() {
 		System.out.println("pula, corre, volta...");

 	}

 	@Override
 	public void brincarSala() {
 		System.out.println("Pega o osso, a bolinha, a madeira...");

 	}


 	@Override
 	public void levarPassear() {
 		System.out.println("Vamo na rua, mijar, cagar, mija de novo...lá vei pega bosta...");

 	}




 }