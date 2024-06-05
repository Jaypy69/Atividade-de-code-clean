package LPAlore;

import java.util.Scanner;

public class Lpaaula39 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a[] = new int[2];
		int b[] = new int[2];
		int c[] = new int[4];

		for(int i = 0; i<2; i++) {
			System.out.println("Informe o " + i + "° valor..: ");
			a[i] = ler.nextInt();
		}
		for(int i = 0; i<2; i++) {
			System.out.println("Informe o " + i + "º valor..: ");
			b[i] = ler.nextInt();
		}
		for(int i = 0; i < 2; i++) {
			c[i] = a[i];
			c[i+2] = b[i];
		}
		for (int i = 0; 1<4; i++) {
			System.out.println("Informe o " + i + "° valor ..: "c[i]);
		}
	}

}



