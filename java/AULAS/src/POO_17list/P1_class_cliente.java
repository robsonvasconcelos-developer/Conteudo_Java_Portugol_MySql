package POO_17list;

public class P1_class_cliente {

	//public static void main(String[] args) {
		/*
		 * 1) Crie uma classe cliente e apresente os atributos e métodos
		 *  referentes esta classe, em seguida crie um objeto cliente, defina
		 *   as instancias deste objeto e apresente as informações deste objeto
		 *    no console.
		 */

		
		//Atributos
		public String nome;
		public int idade;
		public int codigoCliente;
		public String cpf;
		public char genero;
		public int anoNascimento;
		public boolean ativo;
		
		
		
		//CONSTRUTOR PADRAO
		public P1_class_cliente() {
			
		}
		
		//Construtor - ele tem o mesmo NOME da CLASS
		public P1_class_cliente(String nome, String cpf, int codigoCliente) {
			this.codigoCliente = codigoCliente;
			this.cpf = cpf;
			this.nome = nome;	
			
		}
		public P1_class_cliente(String nome,int codigoCliente) {
			this.codigoCliente = codigoCliente;
			this.nome = nome;
		}
		
		//Metodo ESPECIFICO - Comportamento - FAZ - Verbo/Advervios
		public void mostrarIdade()
		{
			System.out.println("A idade e= "+(2021-anoNascimento));//indicar que o carro esta ligado!
		}
		
		//METODO - SOBRECARGA m= tem atributo (int anoAtul)
		public void mostraIdade(int anoAtual) {
			System.out.println("A idade e "+(anoAtual-anoNascimento));
		}
		
		//Segundo Metodo
		//void faixaEtaria(int idadeMedia) //isto e um PARAMETRO dentro de METODO!!!
		{
			//int velocidadeNova = this.anoAtual/idade;
			//this.anoAtual = anoDaCompra;
		
		
	}

		

}
