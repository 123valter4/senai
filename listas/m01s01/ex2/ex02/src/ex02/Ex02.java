package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		String sobrenome;
		String nome;
		String nomeCompleto;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Qual é seu sobrenome?");
		sobrenome = leitor.nextLine();

		System.out.println("Qual é seu nome?");
		nome = leitor.nextLine();

		nomeCompleto = nome + sobrenome;

		System.out.println("Seu nome completo é " + nome + " " + sobrenome + " e tem " + nomeCompleto.length() + " letras");
		

	}
}
