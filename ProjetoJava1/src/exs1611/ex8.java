package exs1611;

import java.util.Scanner;

public class ex8 {
	public static void main(String args[])
	{
		Scanner ler=new Scanner(System.in);
		
		int x;
		System.out.println("Insira o valor: ");
		x=ler.nextInt();
		{
			if(x<100)
				x=0;
				System.out.print("Valor menor que 100");
				System.out.printf("\nPortanto: %d",x);
		}
			if(x>100)
			System.out.printf("\nO valor é: %d",x);
	}
}