
package entrada_processamento_saida;

import java.util.Scanner;


public class Ex01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int a, b, soma;
		
		System.out.printf("Digite um valor: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		
		soma = a + b;
		
		System.out.printf("A soma �: %d", soma);
		
	}
}
