package exs1811;

import java.util.Scanner;

public class ex11 {
	public static void main(String args[])
	{
		Scanner ler=new Scanner(System.in);
		int x,cont=0,soma=0;
			System.out.println("Insira um número: ");
				x=ler.nextInt();
		do {
			soma=soma+cont;
			cont=cont+1;
		}while(cont<=x);
		
			System.out.printf("Total: %d",soma);
	}
}
