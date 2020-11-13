package exs1311;

import java.util.Scanner;

public class exmediapond {
	public static void main(String args[])
	{
	Scanner ler=new Scanner(System.in);
	float a = 0,b = 0,c = 0;
	float media;
		System.out.println("Insira a primeira nota: ");
			a=ler.nextInt();
		System.out.println("Insira a segunda nota: ");
			b=ler.nextInt();
		System.out.println("Insira a terceira nota: ");
			c=ler.nextInt();
		
			media=((a*2)+(b*3)+(c*5))/10;
			System.out.println("A sua média ponderada é: "+media);
	}
}
