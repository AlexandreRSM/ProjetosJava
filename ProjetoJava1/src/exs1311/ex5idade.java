package exs1311;

import java.util.Scanner;

public class ex5idade {
	public static void main(String args[])
	{
		Scanner ler=new Scanner(System.in);
		int anos,mes,dia,dias;		
		System.out.println("Insira a sua idade: ");
			anos=ler.nextInt();
		System.out.println("Insira os meses: ");
			mes=ler.nextInt();
		System.out.println("Insira os dias: ");
			dia=ler.nextInt();
		dias=(anos*365)+(mes+30)+(dia);
		System.out.println("A sua idade em dias é: "+dias);
	}
}
