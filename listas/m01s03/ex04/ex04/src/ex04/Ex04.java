package ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		
		/* Escreva um código que pergunta ao professor quantas notas um curso
		 * tem e quantos alunos possuem na turma. Após isso, leia todas as
		 * avaliações e imprima o nome de todos os alunos aprovados. 
		 * Considere um aluno aprovado aquele que possui uma média maior ou igual a 7.
		 */
		
		int qtdNotas;
		int qtdAlunos;
			
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Quantas notas há no curso?");
		qtdNotas = leitor.nextInt();
		
		System.out.println("Quantos alunos há no curso?");
		qtdAlunos = leitor.nextInt();
		
		String [] alunosAprovados = new String[qtdAlunos];
		
		for (int i = 0; i < qtdAlunos; i++) {
			
			System.out.println("Digite o nome do aluno " + (i+1));
			String nome = leitor.next();

			int nota = 0;
			
			for( int j = 0; j < qtdNotas; j++) {
				System.out.println("Digite a avaliação " + (j+1));
				nota += leitor.nextInt();
			}
			double media = (double) nota / qtdNotas;
			
			if (media >= 7) {
				alunosAprovados[i] = nome;
			}
		}
		System.out.println("Os alunos aprovados são: ");
		for (int i=0 ; i < alunosAprovados.length; i++) {
			if (alunosAprovados[i] != null) {
			System.out.println(alunosAprovados[i]);
			}
		}
	}
}
