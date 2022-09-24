//6) Faça um Programa que leia três números
//e mostre o maior deles.
package Condicionais;
import java.util.Scanner;

public class Questão6 {
	public static void main(String[] args) {

	Scanner leitor = new Scanner(System.in);
	double n1,n2,n3;
		System.out.println("Digite aqui o seu primeiro número: ");
	n1 = leitor.nextInt();
		System.out.println("Digite agora o seu segundo número: ");
	n2 = leitor.nextInt();
		System.out.println("e agora o terceiro número: ");
	n3 = leitor.nextInt();
		
	if (n1 > n2 && n1 > n3){
		System.out.println("O primeiro"+n1+"é maior");
	}else if (n2>n1 && n2>n3){
		System.out.println("o segundo"+n2+"é maior");
	}else if (n3>n1 && n3>n2){
		System.out.println("o terceiro"+n3+"é maior");
	}else {
		System.out.println("O numero é igual, ou seja, neutro");
	}
	}

}
