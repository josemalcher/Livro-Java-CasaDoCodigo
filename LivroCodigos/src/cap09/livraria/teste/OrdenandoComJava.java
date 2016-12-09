package cap09.livraria.teste;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import cap09.livraria.Autor;
import cap09.livraria.produtos.Ebook;
import cap09.livraria.produtos.Livro;
import cap09.livraria.produtos.LivroFisico;
import cap09.livraria.produtos.Produto;

public class OrdenandoComJava {
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Jose Malcher Junior");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("JAVA 9 o futuro");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Ebook JAVA 9 o futuro");
		ebook.setValor(29.90);
		
		List<Produto> produtos = Arrays.asList(fisico,ebook);
		
		Collections.sort(produtos);
		
		for (Produto produto : produtos) {
			System.out.println(produto.getValor());
		}
		
		
	}
}
