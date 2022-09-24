//3) Faça um Programa que leia três números e mostre o maior deles.

package Condicionais;
import java.util.Scanner;

public class Ex3 {
public static void main(String[] args) {

	int n1,n2,n3;
	int maior = 0;
	int menor = 0;
	Scanner scanner= new Scanner(System.in);
			
	System.out.println("Digite aqui o seu primeiro número: ");
	n1 = scanner.nextInt();
	System.out.println("Digite agora o seu segundo número: ");
	n2 = scanner.nextInt();
	System.out.println("e agora o terceiro número: ");
	n3 = scanner.nextInt();

/*solução elaborada
if (n1 >= n2) {
maior=n1;
}else {
maior=n2;
}
if(maior<=n3) {
maior=n3;
}

System.out.println("O maior numero é o: "+maior);*/
			
//solução mais simples 
	if(n1>n2 && n1>n3) {
		System.out.println("o "+n1+" é o maior");
	}
			
	if(n2>n1 && n2>n3) {
		System.out.println("o "+n2+" é o maior");
	}
			
	if(n3>n1 && n3>n2) {
		System.out.println("o "+n3+" é o maior");
			}
			

		}

	}