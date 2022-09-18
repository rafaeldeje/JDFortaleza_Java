package Introdução;

import java.util.Scanner;

public class Numeroinformado2 {

	public static void main(String[] args) {
		// Faça um Programa que peça um número e então mostre a mensagem "O número informado foi [número]"
		
		Scanner leitor = new Scanner(System.in);
		//System in é o scan 
		//System out é printf
		System.out.println("Digite um número inteiro");
		double numero = leitor.nextDouble();
		System.out.println("o numero informado foi: "+numero);
		
	}

}
