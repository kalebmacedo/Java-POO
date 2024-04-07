package Aula03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Matriz 1
		System.out.println("Digite o número de linhas da matrz 1: ");
		int M = entrada.nextInt();
		
		System.out.println("Digite o número de colunas da matriz 1: ");
		int N = entrada.nextInt();
		
		int [] [] m1 = new int[M][N];
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; i < N; j++) {
				m1[i][j] = entrada.nextInt();
			}
		}
		
		// Matriz 2
		System.out.println("Digite o número de linhas da matriz 2: ");
		int O = entrada.nextInt();
		
		System.out.println("Digite o número de colunas da matriz 2: ");
		int P = entrada.nextInt();
		
		int [] [] m2 = new int[O][P];
		
		for(int i = 0; i < O; i++) {
			for(int j = 0; j < P; j++) {
				m2[i][j] = entrada.nextInt();
			}
		}
		
		// Multiplicação de matrizes (linha X coluna)
		if(N == O) {
			
		} else {
			System.out.println("Não é possível multiplicar M1 por M2");
		}
		
		
		static int[] [] calcularMatriz(int [][] m1, int [][] m2) {
			int M = m1.length; // num de linhas da m1
			int N = m1[0].length; // num de colunas da m1
			
			int O = m2.length; // num de linhas da m2
			int P = m2[0].length; //num de colunas da m2
			
			// Num de linhas == ao num de colunas 
			if(N != O) {
				return null;
			}
			
			int [][] m3 = new int[M][P]; // A multiplicação de uma matriz depende do num de linhas de uma e o num de coluna da outra
			
			for(int i = 0; i < M; i++) {
				for(int j = 0; j < P; j++) {
					for(int k = 0; k < N; k++) {
						m3[i][j] += m1[i][k] * m2[k][j]
					}
				}
			}
		}
	}
}
/*
 * o loop interno (for em k) é usado para percorrer as colunas de M1 e as linhas de M2 para calcular o produto dos elementos correspondentes 
 * de M1 e M2 e somá-los ao elemento correspondente de M3.
 */
