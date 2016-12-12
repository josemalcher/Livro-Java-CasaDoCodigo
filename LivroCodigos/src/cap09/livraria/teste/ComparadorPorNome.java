package cap09.livraria.teste;

import java.util.Comparator;

import cap06.Livro;

public class ComparadorPorNome implements Comparator<Livro> {

	@Override
	public int compare(Livro L1, Livro L2) {

		return L1.getNome().compareTo(L2.getNome());

	}

}
