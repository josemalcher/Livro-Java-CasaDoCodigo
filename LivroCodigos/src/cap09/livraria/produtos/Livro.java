package cap09.livraria.produtos;

import cap09.livraria.Autor;
import cap09.livraria.exception.AutorNuloException;

public abstract class Livro implements Produto{

	private String nome;
	private String descricao;
	private double valor;
	
	private String isbn;
	
	private Autor autor;
	
	private boolean impresso;
	
	
	public Livro(Autor autor) {
	/*	if(autor == null){
			throw new RuntimeException();
		}*/
		if(autor == null){
			throw new AutorNuloException("O autor não pode ser nulo");
		}
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
	
	//aplicado para a interface Promocional
	//public abstract boolean aplicaDesconta(double porcetagem);
	
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
	
/*	solução para simplificar!
 * public int compareTo(Produto outro){
		return this.getValor() - outro.getValor();
	}*/
	
}
