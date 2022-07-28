package ex04;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		
		/* Escreva um código que pergunte ao professor quantas notas um 
		 * curso tem e quantos alunos possuem na turma. Após isso, leia
		 * todas as avaliações e imprima o nome de todos os alunos aprovados.
		 * Considere um aluno aprovado aquele que possui uma média
		 * maior ou igual a 7.
		 */

		int qtdNotas = 0;
		int qtdAlunos = 0;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Quantas notas há no curso?");
		qtdNotas = leitor.nextInt();
		
		System.out.println("Quantos alunos há no curso?");
		qtdAlunos = leitor.nextInt();
		
		
		
	}

}
