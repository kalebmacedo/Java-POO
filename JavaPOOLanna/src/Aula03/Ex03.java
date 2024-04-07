package Aula03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a palavra: ");
		String str = entrada.nextLine();
		
		String textoFormatado = str.replaceAll("\\s+", "").toLowerCase();	// GPT, nao entendi
		char[] vetorCaracter = textoFormatado.toCharArray(); // Função que transforma uma string em um vetor
		
		boolean palindromo = true;
		int comprimento = vetorCaracter.length;	// Tamanho do vetor 
		
		for(int i = 0; i < comprimento; i++) {
			if(vetorCaracter[i] != vetorCaracter[comprimento - i - 1]) {	// Nao entendi esse if!!!
				palindromo = false;
				break;
			}
		}
		if(palindromo) {
			System.out.println("A frase " + str + " é um palíndromo");
		} else {
			System.out.println("A frase " + str + " não é um palíndromo");
		}
		
		
		entrada.close();
	}

}
