package cap07;

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

}
