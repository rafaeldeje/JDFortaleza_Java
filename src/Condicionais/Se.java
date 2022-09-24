package Condicionais;

import java.util.Scanner;
public class Se
{
  public static void main (String[]args)
  {
    String corpo;
    Scanner leitor = new Scanner(System.in); 
	System.out.println ("Digite a parte do seu corpo");
	corpo = leitor.next();
	
      if (corpo == "B")
      {
	System.out.println ("Foi o braco em safado");
      }
    else if (corpo == "M")
      {
	System.out.println ("Foi a merda ne safado");
      }
    else
      System.out.println ("Nao existe");
  }

}


