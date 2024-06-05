package LPAlore;

import java.util.Scanner;

public class Lpaaula37 {

	public static void main(String[] args) {
		double a;
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe um valor: ");
		a = ler.nextDouble();

		if (a % 5 == 0) {
			System.out.println("O número "+ a + " é multiplo de 5");
		}
		if (a % 5 != 0) {
			System.out.print("O número "+ a + "não é múltiplo de 5");
		}	
	}
}