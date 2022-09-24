package Condicionais;
import java.util.Scanner;

public class Questão2 {
	public static void main(String[] args) {
//2) Faça um Programa que peça um valor e
//mostre na tela se o valor é positivo ou negativo
	Scanner leitor = new Scanner(System.in);
	int n1;
	System.out.println("Digite aqui um número: ");
	n1 = leitor.nextInt();
	if (n1 > 0){
		System.out.println("O numero é positivo!");
	}else if (n1 < 0){
		System.out.println("O numero é negativo!");
	}else if (n1 == 0) {
		System.out.println("O numero é neutro!");
		}
	}

}
