package unidade3;

import javax.swing.JOptionPane;

public class CaixaEletronico {

	public static void main(String[] args) {
		int saque;
		Double notas100, notas50, notas10;
		int resto;
		
		saque = Integer.parseInt(JOptionPane.showInputDialog("Favor Informar o valor do saque"));
		
		if (saque%10 == 0) //Valor informado está correto
		{
			notas100 = Math.floor(saque/100);
			resto = saque % 100;
			notas50 = Math.floor(resto/50);
			resto = resto % 50;
			notas10 = Math.floor(resto/10);
			
			if (notas100 > 0)
				System.out.println("O numero de notas de cem="+notas100);
			if (notas50 > 0)
				System.out.println("O numero de notas de cinquenta="+notas50);	
			if (notas10 > 0)
				System.out.println("O numero de notas de dez="+notas10);
		}
		else
			System.out.println("Valor informado do saque esta incorreto");
					
		  
	}

}
