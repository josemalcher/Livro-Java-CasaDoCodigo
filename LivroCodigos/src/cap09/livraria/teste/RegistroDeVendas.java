package cap09.livraria.teste;

import java.util.List;

import cap09.livraria.Autor;
import cap09.livraria.produtos.LivroFisico;
import cap09.livraria.produtos.Ebook;
import cap09.livraria.produtos.Produto;

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
		
		carrinho.adiciona(fisico);;
		carrinho.adiciona(ebook);
		
		System.out.println("TOtal = " + carrinho.getTotal());
		
		System.out.println();
		
		if(fisico.aplicaDesconto10Porcento()){
			System.out.println("TOtal 10% desconto = " + fisico.getValor());
		}
		System.out.println("*****");
		
		//Produto[] produtos = carrinho.getProdutos();
		List<Produto> produtos = carrinho.getProdutos();
		/*for (int i = 0; i < produtos.length; i++) {
			Produto produto = produtos[i];
			if(produto != null){
				System.out.println(produto.getValor());
			}
		}*/
		/*for (int i = 0; i < produtos.length; i++) {
			try{
				Produto produto = produtos[i];
			if(produto != null){
				System.out.println(produto.getValor());
			}
			}//catch(ArrayIndexOutOfBoundsException e){
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Deu Exception no indice "+ i);
				e.printStackTrace();
			}catch(NullPointerException e){
				System.out.println("Array não foi instanciado");
				
			}finally {
				System.out.println("Sempre executado");
			}
		}*/
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
		System.out.println("Fui Executado!");
		
		
		System.out.println("***--CAP 10--*****");
		System.out.println(ebook);
	}
}
