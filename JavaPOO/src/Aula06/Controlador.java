package Aula06;

public interface Controlador {
	// GERALMENTE em uma interface, todos são public 
	public abstract void ligar();
	public abstract void desligar();
	public abstract void abrirMenu(); 
	public abstract void fecharMenu();
	public abstract void maisVolume();
	public abstract void menosVolume();
	public abstract void ligarMudo();
	public abstract void desligarMudo();
	public abstract void play();
	public abstract void pause();
}
