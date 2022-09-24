//4) Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

package Condicionais;
import java.util.Scanner;

public class Ex4 {

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Digite seu sexo: ");
String Feimeninomasculino = input.nextLine(); 


switch(Feimeninomasculino.toUpperCase()){
case "M":
System.out.println("Parabéns, seu sexo é Masculino");
break;

case "F":
System.out.println("Parabéns, seu sexo é Femenino");
break;
	            
default:
System.out.println("Sexo Invalido");
break;

/*outra maneira mais simples com if else
String sexo;
Scanner scanner= new Scanner(System.in);

sexo=scanner.next();

if(sexo.equalsIgnoreCase("F")) {
	System.out.println("Feminino");
}else if(sexo.equalsIgnoreCase("M")){
	System.out.println("Maculino");
}else {
	System.out.println("OP Inválida");*/
		}
	}
}