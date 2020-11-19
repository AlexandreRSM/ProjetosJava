package exs1711;

import java.util.Scanner;

public class ex3 {
	public static void main(String args[])
	{
		Scanner ler=new Scanner(System.in);
		int mac;
		double preco = 0,res,res2,preco2 = 0;
		System.out.println("Insira a quantidade de maçãs: ");
			mac=ler.nextInt();
		if 
			(mac<12)
			preco=0.30;
			res=mac*preco;
			System.out.printf("O valor total em reais, abaixo de 12 unidades é: %g",res);	
		if	
			(mac>12)
			preco2=0.25;
			res2=mac*preco2;
			System.out.printf("\nO valor total em reais, acima de 12 unidades é: %g",res2);
	}		
}
