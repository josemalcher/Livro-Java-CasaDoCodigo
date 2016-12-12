package cap09.livraria.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cap09.livraria.Autor;
import cap09.livraria.produtos.Livro;
import cap09.livraria.produtos.LivroFisico;

public class NovidadesJava8 {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Jose Malcher Jr");

		Livro jovaoo = new LivroFisico(autor);
		jovaoo.setNome("Java OO");

		Livro java8 = new LivroFisico(autor);
		java8.setNome("Java 8 ");

		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Programando em Ruby");

		List<Livro> livros = Arrays.asList(jovaoo, java8,ruby);

		// Collections.sort(livros, new ComparadorPorNome() );
		
		//classe anônimas
/*		Collections.sort(livros, new ComparadorPorNome() {
			@Override
			public int compare(Livro L1, Livro L2) {

				return L1.getNome().compareTo(L2.getNome());
			}
		});*/
		
		//JAVA 8
		livros.sort(new Comparator<Livro>(){

			@Override
			public int compare(Livro L1, Livro L2) {
				return L1.getNome().compareTo(L2.getNome());
			}
			
		});
		
		
		livros.sort((Livro L1,Livro L2) -> {
			return L1.getNome().compareTo(L2.getNome());
		});
		//ou
		livros.sort(
				(L1, L2) -> L1.getNome().compareTo(L2.getNome())
		);
		
		//ou
		// livros.sort(comparing(l -> l.getNome()));
		
		// + simplificado
		//livros.sort(comparing(Livro::getNome));
		
		for (Livro livro : livros) {
			System.out.println(livro.getNome());
		}
		//ou
		livros.forEach(l -> System.out.println(l.getNome()));
		System.out.println("");
		System.out.println("********");
		//Stream
		
		/*List<Livro> filtrados = new ArrayList<>();
		for (Livro livro : livros) {
			if(livro.getNome().contains("Java")){
				filtrados.add(livro);
			}
		}*/
		
		livros.stream().filter(l -> l.getNome().contains("Java"));
		
		System.out.println("Stream funcionando:");
		livros.stream()
			.filter(l -> l.getNome().contains("Java"))
			.forEach(l -> System.out.println(l.getNome()));
		
		System.out.println("\nStream não funcionando:");
		for (Livro livro : livros) {
			System.out.println(livro.getNome());
		}
		
		
		
		

	}

}
