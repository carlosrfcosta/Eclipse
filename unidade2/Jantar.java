package unidade2;

import javax.swing.JOptionPane;

public class Jantar {

	public static void main(String[] args) {
		final Double taxa_garcom = 0.1; //constante
		double valor_jantar, valor_jantar_total;//variaveis
		
		valor_jantar = Double.parseDouble(JOptionPane.showInputDialog("Informar o valor do jantar"));
	    valor_jantar_total = valor_jantar + (taxa_garcom*valor_jantar);
		JOptionPane.showMessageDialog(null, " o valor total do jantar a ser pago é "+valor_jantar_total);	
		
		
	}

}
