package exs1711;

import java.util.Scanner;

public class ex2 {
	public static void main(String args[])
	{
		Scanner ler=new Scanner(System.in);
		int senha;
		
		System.out.println("Insira a senha: ");
			senha=ler.nextInt();
		if
			(senha==1234)
				System.out.println("Acesso liberado!");
		{
		if 
			(senha!=1234)
				System.out.println("Acesso bloqueado!");
		}
	}
}
