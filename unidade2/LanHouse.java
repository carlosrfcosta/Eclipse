package unidade2;

import javax.swing.JOptionPane;

public class LanHouse {

	public static void main(String[] args) {
		final int VALOR_POR_15MINUTOS = 2;
		
		double horas, minutos, total_minutos;
		double total_apagar;
		
		horas = Double.parseDouble(JOptionPane.showInputDialog("Informar o numero de horas utilizadas"));
		minutos = Double.parseDouble(JOptionPane.showInputDialog("Informar o minutos a pagar"));
		
		total_minutos = horas*60 + minutos;
		total_apagar = Math.ceil((total_minutos/15))*VALOR_POR_15MINUTOS;
		
		JOptionPane.showMessageDialog(null, "O valor a pagar � de R$"+total_apagar);
		
		
	}

}
