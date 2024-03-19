package Aula06;
// Encapsulamento = controlar o acesso em alguns dados, mais proteção.

public class Aula06 {

	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		
		c.maisVolume();
		c.play();
		c.abrirMenu();
		c.fecharMenu();
	}

}
