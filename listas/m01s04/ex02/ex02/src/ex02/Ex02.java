package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 * - Ler uma quantidade de nomes de pessoas e suas idades; - Os nomes informados
		 * devem ser armazenados em um vetor e as idades em outro vetor; - Depois disso,
		 * apresente em tela o nome da pessoa mais velha;
		 */

		Scanner leitor = new Scanner(System.in);

		System.out.println("Quantas pessoas você vai digitar?");
		int qtdPessoas = leitor.nextInt();

		String nome[] = new String[qtdPessoas];
		int idade[] = new int[qtdPessoas];
		int idadePessoaMaisVelha = 0;
		String nomePessoaMaisVelha = "";

		for (int i = 0; i < qtdPessoas; i++) {
			System.out.println("Digite o nome da " + (i + 1) + "ª pessoa.");
			nome[i] = leitor.next();

			System.out.println("Digite a idade da " + (i + 1) + "ª pessoa.");
			idade[i] = leitor.nextInt();

			if (idade[i] > idadePessoaMaisVelha) {
				idadePessoaMaisVelha = idade[i];
				nomePessoaMaisVelha = nome[i];
			}

		}
		System.out.println(
				"A pessoa mais velha é " + nomePessoaMaisVelha + ", que tem " + idadePessoaMaisVelha + " anos.");
		leitor.close();
	}
}
