package ex01;

public class Ex01 {
	
public static void main(String[] args) {
	//  Faça código em Java para a expressão: " !((i > 4) || (j <= 5)) " 
	//	onde para i = 10 e j = 3. Apresente os resultados ao usuário (no terminal)
	//	de maneira clara e sequencial (passo a passo da execução). 
	
	int x = 0, y = 1, z = 2;
    
    System.out.println("Resolução detalhada da expressão: !((i > 4) || (j <= 5)), onde para i = 10 e j = 3.");
    System.out.println("R1: atribuir os valores às variaveis -> !((10 > 4) || (3 <= 5))");
    System.out.println("R2: resolver a primeira expressão (10 > 4)-> " + (10 > 4));
    System.out.println("R3: resolver a segunda expressão (3 <= 5) -> " + (3 <= 5));
    System.out.println("R4: verificar se a primeira ou a segunda expressões são verdadeiras -> " + ((10 > 4) || (3 <= 5)));
    System.out.println("R5: alterar o valor booleano da R4 !((10 > 4) || (3 <= 5)) -> " + !((10 > 4) || (3 <= 5)) );
}
}
