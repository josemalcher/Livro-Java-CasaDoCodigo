package cap09.livraria.produtos;

import cap09.livraria.Autor;

public class MiniLivro extends Livro implements Promocional{

	public MiniLivro(Autor autor) {
		super(autor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean aplicaDesconta(double porcetagem) {
		// TODO Auto-generated method stub
		return false;
	}
	public int compareTo(Produto outro) {
		if(this.getValor() < outro.getValor()){
			return -1;
		}
		if(this.getValor() > outro.getValor()){
			return 1;
		}
		return 0;
	}

}
