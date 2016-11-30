package cap06;

public class CadastroDeLivros {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("jose malcher jr");
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("TDD ");
		
		livro.mostraDetalhes();

	}

}
