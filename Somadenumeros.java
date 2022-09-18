package Introdução;

import java.util.Scanner;

public class Somadenumeros {

	public static void main(String[] args) {
		// 3Faça um Programa que peça dois números e imprima a soma.
		Scanner leitor = new Scanner(System.in);
		//System in é o scan 
		//System out é printf
		double n1,n2,soma;//variantes
		System.out.println("digite o primeiro numero");
		n1=leitor.nextDouble();
		System.out.println("digite o segundo numero");
		n2=leitor.nextDouble();
		soma=n1+n2;
		System.out.println("a soma dos dois numeros foi: "+soma);
		//juntei o texto mais a variante soma
		
	}

}
