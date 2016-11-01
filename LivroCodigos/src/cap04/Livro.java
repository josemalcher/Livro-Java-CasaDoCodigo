package cap04;

public class Livro {

	String nome;
	String descricao;
	double valor;
	String isbn;
	
	Autor autor;
	
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
	
	public boolean aplicaDesconta(double porcetagem){
		if(porcetagem > 0.3){
			return false;
		}
		this.valor -= this.valor * porcetagem;
		return true;
	}
	
	public boolean temAutor(){
	
		return this.autor != null;
	}
}
