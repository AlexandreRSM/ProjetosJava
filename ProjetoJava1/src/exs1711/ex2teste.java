package exs1711;

import java.util.Scanner;

public class ex2teste {
	public static void main(String args[])
	{
		Scanner ler=new Scanner(System.in);
		int senha;
		
		System.out.println("Insira a senha: ");
			senha=ler.nextInt();
		switch (senha) {
		case 1:
			System.out.printf("Senha correta!");
			break;
		case 2:
			System.out.printf("Senha inválida!");
			break;
			
		}
	}
}


