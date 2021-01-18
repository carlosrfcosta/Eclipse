package unidade2;

import javax.swing.JOptionPane;

public class Numero 
{//Inicio

public static void main(String[] args) 
{//Inicio
   int numero = Integer.parseInt((JOptionPane.showInputDialog("Informar o numero")));
   int anterior = numero -1;
   int posterior = numero +1;
   JOptionPane.showMessageDialog(null, "o valor do numero anterior="+anterior+" e o posterior="+posterior);

}//fim

}//fim
