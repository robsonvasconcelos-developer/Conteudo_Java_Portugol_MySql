package Desafios;

import javax.swing.JOptionPane;

public class LerAresdeUmRetangulo {

	public static void main(String[] args) {
		// variaveis
		
		double l = 0.00, total=0;
		double a = 0.00, soma =0;
		int aux;

		aux = Integer.parseInt(JOptionPane.showInputDialog("Como deseja criar?"));
		Retangulo[] retangulos = null;
		
		for(int x=0; x< aux;x++) {
			retangulos = new Retangulo [aux];
		
		l = Double.parseDouble(JOptionPane.showInputDialog("largura"));
		a = Double.parseDouble(JOptionPane.showInputDialog("altura"));
		
		retangulos[x]= new Retangulo(l,a);
		total += (l * a);
		System.out.println(retangulos[x]);
		
		}
		
	}

}
