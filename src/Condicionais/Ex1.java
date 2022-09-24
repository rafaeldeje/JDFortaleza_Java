package Condicionais;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*1) Faça um Programa que peça dois números
		 * e imprima o maior deles.
		 */

		Scanner scanner = new Scanner(System.in);
		int n1,n2;
		
		System.out.println("Digite aqui o seu primeiro número: ");
		n1 = scanner.nextInt();
		System.out.println("Digite agora o seu segundo número: ");
		n2 = scanner.nextInt();
		
		if (n1>n2) {
			System.out.println("O primeiro"+n1+"é maior");
		}else if (n2>n1){
			System.out.println("o Segundo"+n2+"é maior");
		}else{
			System.out.println("Os números são iguais!");}
		
		
	}

}
