package unidade3;

import javax.swing.JOptionPane;

public class Moeda {

	public static void main(String[] args) {
		
		Double valor; 
		Double valor_convertido;
		int tipo_moeda;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Favor Informar o valor a ser convertido"));
        tipo_moeda = Integer.parseInt(JOptionPane.showInputDialog("Favor Informar o tipo de moeda [1-libra][2-D�lar][3-Euro]"));
        
        switch (tipo_moeda)
        {
        case 1: //Libra
        {	
           valor_convertido = valor/5;
           JOptionPane.showMessageDialog(null, "O valor convertido em Libras � de "+valor_convertido);
           break;
        }  
        case 2: //D�lar
        {	
           valor_convertido = valor/4;
           JOptionPane.showMessageDialog(null, "O valor convertido em D�lar � de "+valor_convertido);
           break;
        }  	
        case 3: //Euro
        {	
           valor_convertido = valor/4.4;
           JOptionPane.showMessageDialog(null, "O valor convertido em Euro � de "+valor_convertido);
           break;
        }  	
        default:
        	JOptionPane.showMessageDialog(null, "Op��o digitada incorreta");
          
        }
	}

}
