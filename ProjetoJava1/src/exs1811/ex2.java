package exs1811;

import java.util.Scanner;

public class ex2 {
	public static void main(String args[])
	{
		Scanner ler=new Scanner(System.in);
		
		int num,res,par=0,impar=0;
		for(int cont=1;cont<=10;cont++)
		{
			System.out.println("Insira o número: ");
			num=ler.nextInt();
			res=num%2;
				if(res==0)
				{
					par=par+1;
				
				}else
					impar=impar+1;
		}
		System.out.printf("Valores pares: %d",par);
		System.out.printf("\nValores impares: %d",impar);
	}
}
