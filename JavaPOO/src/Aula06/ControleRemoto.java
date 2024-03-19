package Aula06;

public class ControleRemoto implements Controlador{
	// Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	/*
	 * Todos estão em 'private' para mais segurança, tudo usando o encapsulamento. Sem que haja uma modificação no main
	 */
	
	// Métodos Especiais 
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
		
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int v) {
		this.volume = v;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean l) {
		this.ligado = l;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean t) {
		this.tocando = t;
	}
	
	// Métodos Abstratos
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.setLigado(false);
	}
	
	@Override
	public void abrirMenu() {
		// TODO Auto-generated method stub
		System.out.println("-----MENU-----");
		System.out.println("Está ligado?" + this.getLigado());
		System.out.println("Está tocando?" + this.getTocando());
		System.out.print("Volume: " + this.getVolume());
		for(int i = 0; i <= this.getVolume(); i+= 10) {
			System.out.print("|");
		}
	}
	
	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		System.out.println("Fechando o menu");
	}

	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		if(this.getLigado() == true) {
			this.setVolume(this.getVolume() + 5);
		} else {
			System.out.println("Impossível aumentar o volume");
		}
	}

	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		if(this.getLigado() == true) {
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("Impossível diminuir o volume");
		}
	}

	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		if(this.getLigado() == true && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub 
		if(this.getLigado() == true && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if(this.getLigado() == true && this.getTocando()) {
			this.setTocando(true);
		} else {
			System.out.println("Não consegui reproduzir");
		}
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if(this.getLigado() == true && this.getTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("Não consegui pausar");
		}
	}
	
	
}
