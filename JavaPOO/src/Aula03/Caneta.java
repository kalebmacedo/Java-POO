package Aula03;
// Visibilidade (aula)
//	public - protected - private(nao mexe!!)

public class Caneta {
	// Atributos 
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
		
	// Métodos 
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
	}
		
	protected void tampar() {
		this.tampada = true;
	}
		
	protected void destampar() {
		this.tampada = false;
	}
		
	// Estado
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Esta tampada? " + this.tampada);
		}
}
