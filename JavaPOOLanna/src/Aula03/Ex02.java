package Aula03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Defina o tamanho do vetor: ");
		int tam = entrada.nextInt();
		
		int vetor[] = new int[tam];
		
		int soma = 0;
		int positivo = 0, negativo = 0;
		int qtdZero = 0;
		int par = 0, impar = 0;
		
		
		System.out.println("Digite os valores: ");
		for(int i = 0; i < tam; i++) {
			vetor[i] = entrada.nextInt();
			soma += vetor[i];
			//
			if(vetor[i] > 0) {
				positivo++;
			} else {
				negativo++;
			}
			//
			if(vetor[i] == 0) {
				qtdZero++;
			}
			//
			if(vetor[i] % 2 == 0) {
				par++;
			} else if(vetor[i] % 2 != 0) {
				impar++;
			}
		}
		
		// Média
		int media = soma / tam;
		System.out.println("A média: " + media);
		
		// Qtd de (+)
		System.out.println("A quantidade de positivos: " + positivo);
		
		//Qtd de (-)
		System.out.println("A quantidade de negativos: " + negativo);
		
		//Qtd de 0
		System.out.println("A quantidade de zeros: " + qtdZero);
		
		//Qtd num PARES
		System.out.println("A quantidade de pares: " + par);
		
		//Qtd num IMPARES
		System.out.println("A quantidade de ímpares: " + impar);

	}

}
