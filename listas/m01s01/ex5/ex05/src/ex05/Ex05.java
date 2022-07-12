package ex05;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean praticaEsporte;
		String pergunta;
		
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Qual é seu nome?");
		nome = leitor.nextLine();
		
		System.out.println("Qual é sua idade?");
		idade = leitor.nextInt();
		
		System.out.println("Pratica esporte? (sim ou não)");
		pergunta = leitor.next();
		
		if(pergunta.equalsIgnoreCase("sim")) {
			praticaEsporte = true;
			System.out.println("Olá " + nome + ", você tem " + idade + " anos e pratica esportes!");
		} else {
			praticaEsporte = false;
			System.out.println("Olá " + nome + ", você tem " + idade + " anos e não pratica esportes!");
		}
		
	}
	
}
