package Aula04;
/*
 * --> PROTEGE O ATRIBUTO: set(insere em TUDO{PÚBILCO E PRIVADO}), get(pega em TUDO{PÚBILCO E PRIVADO})
 */
public class Aula04 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
		c1.status();
		 
		Caneta c2 = new Caneta("VANESSA", "Azul", 1.5f);
		c2.status();
		
		System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());	// MAIN
	}

}
