package Aula05;

public class Aula05 {

	public static void main(String[] args) {
		// Pessoa 01
		ContaBanco p1 = new ContaBanco();
		
		p1.setNumConta(4053);
		p1.setDono("Kaleb");
		p1.abrirConta("CC");
		p1.depositar(100);
		
		p1.estadoAtual();
		
		// Pessoa 02
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2762);
		p2.setDono("Vanessa");
		p2.abrirConta("CP");
		p2.depositar(500);
		p2.sacar(100);
		
		p2.estadoAtual();

	}

}
