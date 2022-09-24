//7) Faça um Programa que leia três
//números e mostre o maior e o menor deles.

package Condicionais;
import java.util.Scanner;

public class Ex7 {
public static void main(String[] args) {

    int n1,n2,n3;
    Scanner leitor = new Scanner(System.in);
    int maior=0;
    int menor=0;

    System.out.println("Digite aqui o seu primeiro número: ");
    n1 = leitor.nextInt();
    System.out.println("Digite agora o seu segundo número: ");
    n2 = leitor.nextInt();
    System.out.println("e agora o terceiro número: ");
    n3 = leitor.nextInt();

    if(n1>n2) {
        maior = n1;
    }else {
        maior = n2 ;
    }if (n3>maior) {
        maior = n3;
    }if(n1<n2) {
            menor = n1;
        }else {
            menor = n2;
        }if (n3<menor) {
            menor = n3;
        }
    System.out.println("o numero maior é: " + maior+" o numero menor é: "+ menor );
	}
}
