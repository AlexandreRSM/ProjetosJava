package exs1311;

import java.util.Scanner;

public class ex3mat {
	public static void main(String args[])
	{
		Scanner ler=new Scanner(System.in);
		int a,b,c,d,r,s;
			System.out.println("Insira o valor A: ");
			a=ler.nextInt();
			System.out.println("Insira o valor B: ");
			b=ler.nextInt();
			System.out.println("Insira o valor C: ");
			c=ler.nextInt();
				s=(b+c)*(b+c);
				r=(a+b)*(a+b);
				d=(r+s)/2;	
			System.out.print("Valor de D: "+d);
	}
}
