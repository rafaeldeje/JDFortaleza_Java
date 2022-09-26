package Repeticao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
/*2) Faça um programa que imprima na tela os números de 1 a 30 e do lado apresente a soma dos números existentes.
*/
	Scanner leitor = new Scanner(System.in);
		
		for (int i = 1; i<=30 ; i++) {
			System.out.println(i + "+" + i  + " = " + (i+i));
		}
	}

	}

