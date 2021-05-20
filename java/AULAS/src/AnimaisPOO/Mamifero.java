package AnimaisPOO;




public abstract class Mamifero extends Animal {


	public Mamifero(String nome, int idade) {
		super(nome, idade);
		
	}

	public void emiteSom(){
		System.out.println("Fazer som");
	}

	public abstract void mamar();


}