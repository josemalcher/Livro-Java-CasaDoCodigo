package cap06;

public abstract class Livro {

	private String nome;
	private String descricao;
	private double valor;
	
	private String isbn;
	
	private Autor autor;
	
	private boolean impresso;
	
	
	public Livro(Autor autor) {
		this.isbn = "000-00-00000-00-0";
		this.autor = autor;
		this.impresso = true;
	}

	void mostraDetalhes(){
		System.out.println("Mostrando Detalhes do Livro: ");
		System.out.println("Nome: "+ nome);
		System.out.println("Descrição "+descricao);
		System.out.println("Valor "+ valor);
		System.out.println("ISBN "+isbn);
		System.out.println("______");
		
		if(this.temAutor()){
			autor.mostraDetalhes();
		}else{
			System.out.println("Autor Não cadastrado");
		}
		
	}
	
	public abstract boolean aplicaDesconta(double porcetagem);
	
	public boolean temAutor(){
	
		return this.autor != null;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
