package Condicionais;
//8) Faça um programa para a leitura de duas notas parciais de um aluno.
//O programa deve calcular a média alcançada por aluno e apresentar:
   //a) A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
   //b) A mensagem "Reprovado", se a média for menor do que sete;
   //c) A mensagem "Aprovado com Distinção", se a média for igual a dez.
import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		float n1,n2,soma, media;
		
		System.out.println("Digite aqui a sua primeira nota.");
		n1 = leitor.nextFloat();

		System.out.println("Digite agora a sua segunda nota.");
		n2 = leitor.nextFloat();

		soma=n1+n2;
		media=soma/2;
		System.out.println("Sua media é: "+media);
		
		if (media == 10) {
			System.out.println("Aprovado com distinção");
		}else if (media >= 6) {
	        System.out.println("Você está acima da media, está aprovado.");
	    }else {
	    	System.out.println("Você está abaixo da media, está reprovado.");
	    }
	    
	}}