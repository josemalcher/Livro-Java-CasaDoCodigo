package cap07;

public class RegistroDeVendas {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Jose Malcher Jr");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("TDD com JAVA");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("JavaEE");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(ebook);
		carrinho.adiciona(fisico);
		
		System.out.println("TOtal = " + carrinho.getTotal());
		
		System.out.println();
		
		if(fisico.aplicaDesconto10Porcento()){
			System.out.println("TOtal 10% desconto = " + fisico.getValor());
		}
	}
}
