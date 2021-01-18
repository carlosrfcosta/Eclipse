package unidade2;

import javax.swing.JOptionPane;

public class EscreveVariaveis {

	public static void main(String[] args) {
		
		//String fruta = "banana";
		double valor = 3.50;
		String fruta = JOptionPane.showInputDialog("Digite a fruta");
		//System.out.println(" o valor da "+fruta+" é de "+valor);
        JOptionPane.showMessageDialog(null, "O valor da "+fruta+" é de "+valor);
        
		
	}

}
