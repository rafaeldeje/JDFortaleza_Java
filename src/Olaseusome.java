package Introdução;
import java.util.Scanner;
public class Olaseusome {

	public static void main(String[] args) {
	//7) Faça um programa que peça um nome e mostre a mensagem "Boa noite [nome]"
		Scanner leitor = new Scanner (System.in);		
		System.out.println("Digite o seu nome ");
		String nome = leitor.next();
		System.out.println("Boa noite "+nome);
		
	}
}