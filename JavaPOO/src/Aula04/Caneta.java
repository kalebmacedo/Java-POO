package Aula04;

public class Caneta {
	// Atributos
	public String modelo;
	private float ponta;
	private String cor;
	boolean tampada;
	

	// Método construtor, mesmo nome da classe (caneta)
	//		--> como se fosse um método geral
	public Caneta(String m, String c, float p) { // Passar os parâmetros para o main
		this.modelo = m;
		this.cor = c;
		this.setPonta(p); // ou 'this.ponta = c;'
		this.tampar();
	}
	
	// Métodos
	public String getModelo() {			// GET tem que ter return
		return this.modelo;
	}
	
	public void setModelo(String m) {	// SET tem que receber parâmetros 
		this.modelo = m;
	}
	
	public float getPonta() {			// GET tem que ter return
		return this.ponta;
	}
	
	public void setPonta(float p) {		// SET tem que receber parâmetros 
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	// Status
	public void status() {
		System.out.println("SOBRE A CANETA:");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta()); 
		System.out.println("Cor: " + this.cor);	// Não tem método get e set para cor, por isso ta 'this.cor'.
		System.out.println("Tampada: " + this.tampada);	// Não tem método get e set para tampada, por isso ta 'this.cor'.
	}
}


/*
 * Método construtor pode ser gerado automaticamente
 * ---> botao DIREITO ---> SOURCE ---> ...  
 */