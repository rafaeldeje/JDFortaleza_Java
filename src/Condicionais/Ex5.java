//5) Faça um Programa que pergunte em que turno você estuda. Peça para digitar
//M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem
//"Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
package Condicionais;
import java.util.Scanner;

public class Ex5 {

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
	    
/* outra maneira com if else
 * String turno;
		Scanner scanner= new Scanner(System.in);
		
		turno=scanner.next();
		
		if(turno.equalsIgnoreCase("B")) {
			System.out.println("Bom dia");
		}else if(turno.equalsIgnoreCase("T")){
			System.out.println("Boa tarde");
		}else if(turno.equalsIgnoreCase("N")){
			System.out.println("Boa noite");
		}else {
			System.out.println("OP Inválida");
		}*/		
		}
	}
}