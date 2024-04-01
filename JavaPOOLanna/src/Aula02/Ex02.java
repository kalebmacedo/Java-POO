package Aula02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de 'a': ");
		int a = entrada.nextInt();
		
		System.out.println("Digite o valor de 'b'; ");
		int b = entrada.nextInt();
		

		int soma = a + b;
		
		int subtracao = a - b;
		
		int multiplicacao = a * b;
		
		int divisao = a / b;
		
		int potencia = a ^ b;
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		System.out.println(potencia);
		
		entrada.close();
	}

}
