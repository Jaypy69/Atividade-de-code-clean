package LPAlore;

import java.util.Scanner;

public class Lpaaula38 {

	public static void main(String[] args) {
		int senhaMestre, senhaTentativa;
		double n1, n2, soma;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Cadastre uma senha ( Apenas numéros ); ");
		senhaMestre = ler.nextInt();
		
		System.out.print("Digite um número: ");
		n1 = ler.nextDouble();
		System.out.print("Digite outro número: ");
		n2 = ler.nextDouble();
		soma = n1+n2;
		
		System.out.print("Digite a sua senha para desbloquear a soma: ");
		senhaTentativa = ler.nextInt();
		
		if (senhaTentativa == senhaMestre)
			System.out.print("A soma é: " + soma);
		{
		if (senhaTentativa != senhaMestre) {
			System.out.println("Senha incorreta!");
		}
		}
	}
}
