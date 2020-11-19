package exs1611;

import java.util.Scanner;

public class ex2trabhora 
{
	public static void main(String args[])
	{
		int C,N,xE,S,total;
		
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Insira o código do trabalhador: ");
			C=ler.nextInt();
		System.out.println("Insira o número de horas trabalhadas: ");
			N=ler.nextInt();
			if (N<=50)
			{
				xE=0;
				S=10*N;
				System.out.printf("Salário total do funcionário: %d",S);
			}
			else
			{
				xE=(N-50)*20;
				S=10*50;
				total=S+xE;
				System.out.printf("\nSalário total é R$%d",total);
			}	
	}
}