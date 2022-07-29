package ex04;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		/* Leia uma quantidade limitadora de valores que irão ser digitados (inteiro);
	       Após, leia números decimais;
		   Após ler todos os números decimais, mostre no terminal o maior número do vetor
		       e também a posição do vetor deste maior número;
		*/ 
		int maiorNumero = -10000000;
		int posicaoMaiorNumero = 0;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Quantos números você vai digitar?");
		int qtdNumeros = leitor.nextInt();
		
		int numeros[] = new int [qtdNumeros];
		
		for (int i = 0; i < qtdNumeros; i++) {
			System.out.println("Digite um número");
			numeros[i]= leitor.nextInt();
			
			if(numeros[i] > maiorNumero){
				maiorNumero = numeros[i];
				posicaoMaiorNumero = i;
			}
			
		}
		System.out.println(" Maior valor: " + maiorNumero + 
				" \n Posição do maior valor: " + posicaoMaiorNumero );
		
		leitor.close();
	}

}
