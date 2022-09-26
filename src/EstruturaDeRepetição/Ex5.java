package Repeticao;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// Faça um programa que leia 5 números e informe a soma e a média dos números.
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite os 5 numeros");
		int soma = 0;
		
		for(int i = 1; i<=5 ; i++) {
			
			soma+=leitor.nextInt();
		}
		
		System.out.println("a soma é: " + soma + "\n" +"a media é: "+ soma/5);
		
	}

}