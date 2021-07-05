package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade = 0, menor = 0, maior = 0;

		while (idade != -99) {
			System.out.println("Digite uma idade: ");
			idade = ler.nextInt();

			if (idade > 0 && idade < 21) {
				menor++;
				System.out.println("Menos de 21!");
			} else if (idade > 50) {
				maior++;
				System.out.println("Mais de 50!");
			} else {
				System.out.println("Fora da contagem!");
			}

		}
		System.out.println("Quantidade de pessoas com menos de 21 anos de idade: " + menor);
		System.out.println("\nQuantidade de pessoas com mais de 50 anos de idade: " + maior);
	}

}