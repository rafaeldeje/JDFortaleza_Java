package Repeticao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//  Faça um programa que leia 5 números e informe o maior número.
		Scanner leitor = new Scanner(System.in);
		int n1=0;
		int maior =0;
		int menor =9999;
		System.out.println("digite os 5 numeros");
		
		
		for (int i = 1; i<=5; i++) {
			
			n1 = leitor.nextInt();
			
			if(maior<n1) {
				 maior = n1;
				 
			}else if (menor > n1) {
				System.out.println("digite um numero positivo");
				break;
			}
			
	
		}
		System.out.println("o numero maior foi: "+ maior);
	}
}