package exs1611;

import java.util.Scanner;

public class ex2trabhora 
{
	public static void main(String args[])
	{
		int C,N,xE,S,total;
		
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Insira o c�digo do trabalhador: ");
			C=ler.nextInt();
		System.out.println("Insira o n�mero de horas trabalhadas: ");
			N=ler.nextInt();
			if (N<=50)
			{
				xE=0;
				S=10*N;
				System.out.printf("Sal�rio total do funcion�rio: %d",S);
			}
			else
			{
				xE=(N-50)*20;
				S=10*50;
				total=S+xE;
				System.out.printf("\nSal�rio total � R$%d",total);
			}	
	}
}