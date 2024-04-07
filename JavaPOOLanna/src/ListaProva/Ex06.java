package ListaProva;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String resposta = "";
		
		System.out.println("Solta: ");
		int num = entrada.nextInt();
		
		while(num > 1) {
			int resto = num % 2;
			resposta = resto + resposta;
			num = num / 2;
		}
		resposta = num + resposta;
		System.out.println(resposta + " pintos");
		entrada.close();
	}

}
