package Repeticao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// Faça um programa que receba dois números inteiros e gere os números inteiros que estão no
		//intervalo compreendido por eles.
		
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite os dois numeros: ");
			int n1 = 0;
			int n2= 0;
			n1  = leitor.nextInt();
			n2  = leitor.nextInt();
			
			for (int i = n1+1 ; i<n2;i++) {
				
				System.out.println(i);
				
				
			}
			
		

	}

}