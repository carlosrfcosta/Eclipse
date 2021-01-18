package unidade3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o lado A do triãngulo");
		double a  = teclado.nextInt();
		
		System.out.println("Digite o lado B do triãngulo");
		double b  = teclado.nextInt();
		
		System.out.println("Digite o lado C do triãngulo");
		double c  = teclado.nextInt();
		
		if ((a<b+c) && (b<a+c) && (c<a+b))
		{		
		  //È triãngulo
		  //Qual o tipo..?
		  if ((a==b)&&(b==c))
			  System.out.println("Triãngulo Equilátero!");
		  else
		  {
			if ((a==b)||(b==c))
			  System.out.println("Triãngulo Isósceles!");
			else
		      System.out.println("Triãngulo Escaleno!"); 		
			  
		   }
		}	
		   else 
			System.out.println("Os lados Informados não formam um triângulo!");
	
	}
	

}
