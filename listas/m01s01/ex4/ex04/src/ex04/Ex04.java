package ex04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		String sobrenome;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual é seu último sobrenome?");
		sobrenome = leitor.nextLine();
		
		System.out.println("Olá " + sobrenome.toUpperCase() +". Seu sobrenome contém " + sobrenome.length() + " letras." );
	}
}
