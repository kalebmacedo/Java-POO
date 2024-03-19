package Aula05; 

public class ContaBanco {
	// Atributos 
	public int numConta;
	protected String tipoConta; 
	private String dono;
	private float saldo;
	private boolean status;
	
	// Métodos
	public void estadoAtual() {
		System.out.println("---------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipoConta());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	public void abrirConta(String t) {
		this.setTipoConta(t);
		setStatus(true);
		
		if(t == "CC") {
			this.setSaldo(50);
		} else if(t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");
	}
	
	public void fecharConta() { 
		if(this.getSaldo() > 0) {
			 System.out.println("Conta com dinheiro!");
		 } else if(this.getSaldo() < 0) {
			 System.out.println("Conta em débito!");
		 } else {
			 this.setStatus(false);
			 System.out.println("Conta fechada com sucesso!");
		 }
	}
	
	public void depositar(float valor) {
		if(this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + valor);	// ou saldo += valor;
			System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
		}else {
			System.out.println("Impossível depositar em uma conta fechada!");
		}
	}
	
	public void sacar(float valor) { 
		if(this.getStatus() == true) {
			if(this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente!");
			}
		} else {
			System.out.println("Impossível sacar de uma conta fechada!");
		}
	}
	
	public void pagarMensal() {
		int v_mensalidade = 0;
		
		if(this.getTipoConta() == "CC") {
			v_mensalidade = 12;
		} else if(this.getTipoConta() == "CP") {
			v_mensalidade = 20;
		} 
		
		if(this.getStatus() == true) {
			this.setSaldo(this.getSaldo() - v_mensalidade);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossível pagar uma conta fechada!");
		}
	}
	
	// Métodos Especias 
	public ContaBanco() {
		this.setSaldo(0);			//this.saldo = 0;
		this.setStatus(false);		//this.status = false;
	}

	public int getNumConta() {
		return this.numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipoConta() {
		return this.tipoConta;
	}

	public void setTipoConta(String t) {
		this.tipoConta = t;
	}

	public String getDono() {
		return this.dono;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public float getSaldo() {
		return this.saldo;
	}

	public void setSaldo(float s) {
		this.saldo = s;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean st) {
		this.status = st;
	}
	
	
}
