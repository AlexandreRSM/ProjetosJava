package exs1311;

import java.util.Scanner;

public class ex4tempo {
	public static void main(String args[])
	{
		Scanner ler=new Scanner(System.in);
		int seg,min,hora,seg2;
			System.out.println("Insira os segundos: ");
				seg=ler.nextInt();
			hora=seg/60/60;
			min=(seg-(hora*60*60))/60;
			seg2=(seg-(min*60+hora*60*60));
		System.out.println("O tempo é horas, minutos e segundos, respectivamente é: "+hora+","+min+","+seg2);
	}
}
