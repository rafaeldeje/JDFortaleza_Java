//5) Faça um Programa que pergunte em que turno você estuda. Peça para digitar
//M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem
//"Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
package Condicionais;
import java.util.Scanner;

public class Questão5 {

public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Digite seu turno: ");
	String turno = input.nextLine(); 


switch(turno.toUpperCase()){
	case "M":
		System.out.println("Seu turno é matutino, Bom dia!");
		break;

	case "V":
		System.out.println("Seu turno é Vespertino, Boa tarde!");
		break;

	case "N":
		System.out.println("Seu turno é noturno, Boa Noite!");
		break;
	            
	default:
		System.out.println("Turno Invalido");
		break;
	                  
		}
	}
}