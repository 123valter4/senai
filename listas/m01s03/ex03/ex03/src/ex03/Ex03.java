package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		/*
		 * Escreva um código que receba um número X (informado pelo usuário) de pares de
		 * Nomes e Sobrenomes. Após o usuário informar todos os nomes e sobrenomes,
		 * exiba um par “<nome>: <quantos caracteres tem a soma do nome>”
		 */
		Scanner leitor = new Scanner(System.in);

		int quantidadeNomes = 0;

		System.out.println("Quantos nomes você quer contar?");
		quantidadeNomes = leitor.nextInt();

		String[] nomes = new String[quantidadeNomes];
		String[] sobrenomes = new String [quantidadeNomes];

		for (int i = 0; i < quantidadeNomes; i++) {
			System.out.println("Escreva o " + (i + 1) + "º nome");
			nomes[i] = leitor.next();
			System.out.println("Agora escreva o " + (i + 1) + "º sobrenome");
			sobrenomes[i] = leitor.next();

		}
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("O nome " + nomes[i] + " " + sobrenomes[i] + " tem " + (nomes[i].length()+ sobrenomes[i].length()) + " caracteres");
		}
	}
}