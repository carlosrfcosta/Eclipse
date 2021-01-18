package unidade2;

import javax.swing.JOptionPane;

public class JantarPizza {

public static void main(String[] args) {
  double valor_jantar = Double.parseDouble(JOptionPane.showInputDialog("Informar o valor do jantar"));
  int numero_clientes = Integer.parseInt((JOptionPane.showInputDialog("Informar o numero de clientes")));
  Double valor_jantar_clientes = valor_jantar/numero_clientes;
  JOptionPane.showMessageDialog(null, " o valor total do jantar a ser pago é "+valor_jantar_clientes+" Cada cliente");
 
	}

}
