package unidade3;

import java.util.Scanner;

public class Raizexata {

	public static void main(String[] args) {
		int numero;
		double raiz_exata, maior_valor;
		
		Scanner teclado = new Scanner(System.in);
		 System.out.println("Digite o valor do numero");
		 numero = teclado.nextInt();
		 raiz_exata = Math.sqrt(numero);
		 maior_valor = Math.round(raiz_exata);
		 
		 if (raiz_exata == maior_valor)
		     System.out.println("Existe raiz exta para o numero"+numero);

	}

}
