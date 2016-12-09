package cap09.livraria.teste;

import java.util.HashSet;
import java.util.Set;

public class TestandoPerformance {

	public static void main(String[] args) {
		
		//List<String> colecao = new ArrayList<String>();
		Set<String> colecao = new HashSet<String>();
		
		for (int i = 0; i < 100000; i++) {
			colecao.add("Item "+i);
		}
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			colecao.contains("Item "+i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		
		System.out.println("Demorou "+tempo+" MS para executar");

	}

}
