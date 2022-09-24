package Condicionais;
import java.util.Scanner;

public class Ex2 {
public static void main(String[] args) {
/*2) Faça um Programa que peça um valor e
mostre na tela se o valor é positivo ou negativo*/
	
	Scanner scanner = new Scanner(System.in);
	int n1;
	System.out.println("Digite aqui um número: ");
	n1 = scanner.nextInt();
	if (n1 > 0){
		System.out.println("O numero é positivo!");
	}else if (n1 < 0){
		System.out.println("O numero é negativo!");
	}else if (n1 == 0) {
		System.out.println("O numero é neutro!");
		}
	}

}
