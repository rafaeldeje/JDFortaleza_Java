package Introdução;

import java.util.Scanner;

public class Calcularmedia {

	public static void main(String[] args) {
		// Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		Scanner leitor = new Scanner(System.in);
		double n1,n2,n3,n4,soma,media;
		System.out.println("digite a primeira nota");
		n1= leitor.nextDouble();
		System.out.println("digite a segunda nota");
		n2= leitor.nextDouble();
		System.out.println("digite a terceira nota");
		n3= leitor.nextDouble();
		System.out.println("digite a quarta nota");
		n4= leitor.nextDouble();
		soma=n1+n2+n3+n4;
		media=soma/4;
		System.out.println("sua media é: "+media);
				
	}

}
