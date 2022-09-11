package javaAgoravai;
import java.util.Scanner;


public class Numero1 {

	public static void main(String[] args) {
	
			System.out.println("Informe sua idade");	
			
			Scanner leitor = new Scanner(System.in);
			
			String variavel;
			
			variavel = leitor.nextLine();
					
			int idade;
			idade=leitor.nextInt();
			
			System.out.println("Olá "+variavel+"sua idade é: "+idade);
				
			System.out.println(idade + 12);
			
			
			}

		

	}