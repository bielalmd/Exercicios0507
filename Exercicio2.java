package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int cont = 1, par = 0, impar = 0, n;

		Scanner ler = new Scanner(System.in);

		for (; cont <= 10; cont++) {

			System.out.println("Digite um número:");
			n = ler.nextInt();

			if (n % 2 == 0) {
				par = par + 1;
			} else {
				impar = impar + 1;
			}
		}
		System.out.println("O total de números pares: " + par);
		System.out.println("O total de número impares: " + impar);
		ler.close();
	}

}