package Introdução;

import java.util.Scanner;

public class NumeroAntSuc {

	public static void main(String[] args) {
	//5) Faça um Programa que peça um número e
	//então mostre o antecessor e o sucessor deste.
	Scanner leitor = new Scanner(System.in);
	System.out.println("digite um numero inteiro");
	double numero = leitor.nextDouble();
	System.out.println("o numero informado foi: "+(numero));
	System.out.println("o antecessor dele é: "+(numero-1));
	System.out.println("o sucessor dele é: "+(numero+1));
	// antecessor e sucessor no caso seria
	//adicionar soma mais ou menos o numero string informado
	}

}