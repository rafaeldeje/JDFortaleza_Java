package Introdução;

import java.util.Scanner;

public class CalcularSalario {

	public static void main(String[] args) {
	//6) Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
	//Calcule e mostre o total do seu salário no referido mês.
	
	Scanner leitor = new Scanner(System.in);
	double salario,valorHoras,valor;
	
	System.out.println("digite o valor das horas trabalhadas: ");
	valorHoras=leitor.nextDouble();
	System.out.println("digite as horas trabalhadas");
	valor=leitor.nextDouble();

 salario = valorHoras * valor;

	System.out.println("Seu salario será de: "+salario);
	
	}

}