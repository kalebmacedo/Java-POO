package Aula03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int valor = lerInteiro("Escolha a figura geométrica desejada: \n"
				+ "1 - Circulo \n"
				+ "2 - Quadrado \n"
				+ "3 - Retângulo \n"
				+ "4 - Trapézio \n"
				+ "5 - Triângulo \n");
		
		switch(valor) {
			case 1:
				float raio = lerFloat("Digite o valor do raio: ");
				
				double perimetroCIR = 2 * Math.PI * raio;	// Só é double pq é PI
				double areaCIR = Math.PI * (Math.pow(raio, raio));
				
				System.out.println("O perímetro do círculo vale " + perimetroCIR + " e sua área vale " + areaCIR);
				break;
				
			case 2:
				float lado = lerFloat("Digite o valor do lado do quadrado: ");
				
				float perimetroQUA = lado * 4;
				float areaQUA = lado * lado;
				
				System.out.println("O perímetro do quadrado vale " + perimetroQUA + " e sua área vale " + areaQUA);
				break;
			
			case 3:
				float baseRET = lerFloat("Digite o valor da base: ");
				float alturaRET = lerFloat("Digite o valor da altura: ");
				
				float perimetroRET = (baseRET * 2) + (alturaRET * 2);
				float areaRET = baseRET * alturaRET;
				
				System.out.println("O perímetro do retângulo vale " + perimetroRET + " e sua área vale " + areaRET);
				break;
			case 4:
				float baseMaior = lerFloat("Digite o valor da base maior: ");
				float baseMenor = lerFloat("Digite o valor da base menor: ");
				float alturaTRAP = lerFloat("Digite o valor da altura: ");
				float lado1 = lerFloat("Digite o valor do lado 1: ");
				float lado2 = lerFloat("Digite o valor do lado 2: ");
				
				float perimetroTRAP = baseMenor + baseMaior + lado1 + lado2;
				float areaTRAP = ((baseMaior + baseMenor) * alturaTRAP) / 2; 
				
				System.out.println("O perímetro do trapézio vale " + perimetroTRAP + " e sua área vale " + areaTRAP);
				break;
			case 5: 
				
		}
		}
		static int lerInteiro (String msg) {
			Scanner entrada = new Scanner(System.in);
			System.out.println(msg);
			int a = entrada.nextInt();
			
			return a;
	}
		static float lerFloat (String msg) {
			Scanner entrada = new Scanner(System.in);
			System.out.println(msg);
			float b = entrada.nextFloat();
			
			return b;
		}
}
