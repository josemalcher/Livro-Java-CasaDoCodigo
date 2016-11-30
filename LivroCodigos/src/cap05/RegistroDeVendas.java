package cap05;

public class RegistroDeVendas {

	public static void main(String[] args) {
		
		Autor autor  = new Autor();
		autor.setNome("Jose Malcher jr");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("TDD");
		fisico.setValor(59.9);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("ebook TDD");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total: "+carrinho.getTotal());
		
		
		

	}

}
