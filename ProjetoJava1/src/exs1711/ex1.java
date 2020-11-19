package exs1711;

import java.util.Scanner;

public class ex1 {
	public static void main(String args[])
	{
		Scanner ler=new Scanner(System.in);
		int x,y;
		
		System.out.println("Insira o primeiro valor: ");
			x=ler.nextInt();
		System.out.println("Insira o segundo valor: ");
			y=ler.nextInt();
		
		if 
			(x>y)
			System.out.printf("O maior valor é: %d",x);
		if
			(x<y)
			System.out.printf("O maior valor é: %d",y);
		if
			(x==y)
			System.out.printf("Os valores são indênticos: %d",x);
		
	}
}
