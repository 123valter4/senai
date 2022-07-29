package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		/* Leia N números inteiros (peça uma quantidade limitadora em tela ao usuário);
		   Após ler N números inteiros, mostre em tela a média somente dos números pares, 
		      e com uma casa decimal após o ponto/vírgula;
		   Caso o usuário não tenha informado números pares, apresente: “Nenhum número par informado.”;
		*/ 
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Quantos elementos vai ter o vetor?");	
		int elementos = leitor.nextInt();
		
		int vetor[] = new int[elementos];
		
		double pares = 0;
		int contador = 0;
		
		for (int i =0; i < elementos; i++) {
		 System.out.println("Digite o " + (i+1) + "º número");
		 vetor[i] = leitor.nextInt();
		 
		 if (vetor[i] % 2 == 0) {
			 pares += vetor[i];
			 contador++;
		 }
		 
		}
		
		 if (pares > 0) {
			 System.out.println("A média dos números pares é " + (pares / contador));
		 } else {
			 System.out.println("Não existe nenhum número par");
		 }
		
		
	}
}
