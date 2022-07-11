package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		String sobrenome;
		String nome;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Qual é seu sobrenome?");
		sobrenome = leitor.nextLine();

		System.out.println("Qual é seu nome?");
		nome = leitor.nextLine();

		System.out.println(
				"Seu nome completo é " + nome + " " + sobrenome + " e suas iniciais são " + nome.charAt(0) + ". " + sobrenome.charAt(0) + ".");
	}
}
