package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		/* Faça um programa em Java que:
			Leia um número inteiro positivo que indicará a quantidade de números inteiros que 
			serão digitados posteriormente, como um limitador de quantidade. 
			Após ler esse número inteiro, peça ir digitando números inteiros e armazene-os em um vetor.
			Após ler todos os números inteiros, conforme o limitador (item 1).
			Apresente em tela somente os números inteiros negativos digitados pelo usuário.
			Exemplo do programa no terminal:
			Quantos numeros voce vai digitar? 6 
			Digite um numero: 8
			Digite um numero: -2
			Digite um numero: 9
			Digite um numero: 10
			Digite um numero: -3
			Digite um numero: -7 

			NUMEROS NEGATIVOS: 
			-2
			-3
			-7
			
			*/ 

		
		int qtdNumeros;
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de números que serão digitados");
		qtdNumeros = leitor.nextInt();
		
		int vetor [] = new int [qtdNumeros];
		
		for (int i = 0; i < qtdNumeros; i++) {
			System.out.println("Digite o " + (i+1) + "º número (pode ser positivo ou negativo)");
			vetor[i] = leitor.nextInt();
		}
		
		System.out.println("Os números negativos digitados são: ");
		
		for (int i = 0; i < qtdNumeros; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		
	}
}
