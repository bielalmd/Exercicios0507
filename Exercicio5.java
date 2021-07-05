package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int numero, armazenagem = 0;

		do {
			System.out.print("Informe um numero para a soma (para finalizar a soma digite 0): ");
			numero = reader.nextInt();
			armazenagem += numero;
		} while (numero != 0);

		System.out.println("A soma dos numeros é: " + armazenagem);

		reader.close();
	}

}