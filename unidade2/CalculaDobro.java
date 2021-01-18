package unidade2;

import javax.swing.JOptionPane;

public class CalculaDobro {

	public static void main(String[] args) {
		/*		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero");
		Double numero = teclado.nextDouble();
		Double dobro = numero * 2;
        System.out.println("O dobro do numero é "+dobro);
        */
		String numero = JOptionPane.showInputDialog("Digite o seu numero");
		Double dobro  = Double.parseDouble(numero)* 2;
		JOptionPane.showMessageDialog(null, " o dobro do numero é "+dobro); 
	
	}

}
