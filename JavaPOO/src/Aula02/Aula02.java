package Aula02;

public class Aula02 {

	public static void main(String[] args) {
		// Instanciar Caneta 1
		Caneta c1 = new Caneta();
		
		// Referência a um ATRIBUTO 1
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		//---c1.tampada = false;
		
		// Referência a um MÉTODO 1
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
		
		// Instanciar Caneta 2
		Caneta c2 = new Caneta();
		
		// Referência a um ATRIBUTO 2
		c2.modelo = "Hostnet";
		c2.cor = "Preta";
		
		// Referência a um MÉTODO 2
		c2.destampar();
		c2.status();  
		c2.rabiscar();
	}

}
// A ORDEM DOS MÉTODOS IMPORTA
