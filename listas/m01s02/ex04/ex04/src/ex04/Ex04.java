package ex04;

public class Ex04 {
	public static void main(String[] args) {
		
		/* Faça um código em Java para determinar o resultado da expressão: 
		 * " !(a + b == c) || ((c != 0) && (b - c >= 19) )" onde para
		 *  a = 34, b = 12 e c = 8. 
		 *  Apresente de maneira clara e sequencial ao usuário o passo a passo 
		 *  até o resultado.
		 */
		
		System.out.println("Resolução detalhada da expressão: !(a + b == c) || ((c != 0) && (b - c >= 19) ), onde para a = 34, b = 12 e c = 8.");
	    System.out.println("R1: atribuir os valores às variaveis -> !(34 + 12 == 8) || ((8 != 0) && (12 - 8 >= 19) )");
	    System.out.println("R2: resolver a primeira expressão (34 + 12 == 8)-> " + (34 + 12 == 8));
	    System.out.println("R3: resolver a segunda expressão (8 != 0) -> " + (8 != 0));
	    System.out.println("R4: resolver a terceira expressão (12 - 8 >= 19) -> " + (12 - 8 >= 19));
	    System.out.println("R5: verificar se a primeira expressão é verdadeira -> (34 + 12 == 8) " + (34 + 12 == 8));
	    System.out.println("R6: alterar o valor booleano da primeira expressão -> !(34 + 12 == 8) " + !(34 + 12 == 8));
	    System.out.println("R7: verificar se a segunda e a terceira expressões são verdadeiras -> ((8 != 0) && (12 - 8 >= 19) " + ((8 != 0) && (12 - 8 >= 19)));
	    System.out.println("R8: verificar se R6 ou R7 é verdadeira -> " + (!(34 + 12 == 8)||((8 != 0) && (12 - 8 >= 19))));    
	}
}
