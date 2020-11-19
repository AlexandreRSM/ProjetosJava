package exs1611;

import java.util.Scanner;

public class ex7 
{
	public static void main(String args[])
	{
		Scanner ler=new Scanner(System.in);
		double b,h,x = 0;
		System.out.println("Separe casas decimais apenas com a vírgula.");
		
		System.out.println("Insira o valor da base: ");
		b=ler.nextDouble();
		System.out.println("Insira o valor da altura; ");
		h=ler.nextDouble();
		{
			if 
			(b>0 && h>0)
				x=(b*h)/2;
			System.out.println(x);
		}
	}
}
