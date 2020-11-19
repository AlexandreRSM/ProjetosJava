package exs1811;

import java.util.Scanner;

public class ex3 {
	public static void main(String args[])
	{
		Scanner ler=new Scanner(System.in);
		int idade=0,menor=0,maior=0;
		while (idade!=-99)
		{
		System.out.println("\nValores menores que 0 (zero), não serão considerados, insira (-99) para encerrar");
		System.out.println("\nInsira a idade: ");
			idade=ler.nextInt();{
			}
				if(idade>=0 && idade<21)
					menor=menor+1;
				if (idade>50)
					maior=maior+1;
			}
		System.out.printf("\nIdades abaixo de 21 anos: %d",menor);
		System.out.printf("\nIdades acima de 50 anos: %d",maior);
	}
}
