package unidade2;

import javax.swing.JOptionPane;

public class Locadora {

public static void main(String[] args) {
		
 String titulo_filme = JOptionPane.showInputDialog("Digite o titulo do filme");
 int duracao_filme_horas = Integer.parseInt((JOptionPane.showInputDialog("Informar o numero de horas do filme")));
 int duracao_filme_minutos = Integer.parseInt((JOptionPane.showInputDialog("Informar o numero de minutos do filme")));
 int nova_duracao_filme = duracao_filme_horas*60 + duracao_filme_minutos;
 JOptionPane.showMessageDialog(null, "A duração total do filme em minutos é de "+nova_duracao_filme);
 
		
	}

}
