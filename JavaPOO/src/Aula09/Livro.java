package Aula09;

public class Livro implements Publicacao {	// 'implements' para acontecer a agregação entre classes 
	// Atributos
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;	// Agregação
	
	// Método Construtor
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	
	// toString
	public String detalhes() {	// antigo 'toString'
		return "Livro [titulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + "\n, pagAtual=" + pagAtual
				+ "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + "\n, idade=" + leitor.getIdade() + "\n, sexo=" + leitor.getSexo() + "]";
	}

	// Método Especial
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	// Métodos Abstratos
	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		this.aberto = true;
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void folhear(int p) {
		// TODO Auto-generated method stub
		if(p > this.totPaginas) {
			this.pagAtual = 0;
		} else {
			this.pagAtual = p;
		}
		this.pagAtual = p;
	}

	@Override
	public void avançarPag() {
		// TODO Auto-generated method stub
		this.pagAtual++;
	}

	@Override
	public void voltarPag() {
		// TODO Auto-generated method stub
		this.pagAtual--;
	}
	
	
	
}
