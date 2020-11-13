package exs1311;

import java.util.Scanner;

public class ex2carro {
	public static void main(String args[])
	{
		double cfab,cfin;
		
			Scanner ler=new Scanner(System.in);
				System.out.println(",Insira o custo de fabricação: ");
				cfab=ler.nextInt();
				cfin=(cfab*1.73);
			System.out.println("O valor final do veículo é: "+cfin);
			
	}
}
