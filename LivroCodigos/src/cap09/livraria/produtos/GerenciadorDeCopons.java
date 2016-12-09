package cap09.livraria.produtos;

import java.util.Arrays;
import java.util.List;

public class GerenciadorDeCopons {

	
	private List<String> cupons;
	
	public GerenciadorDeCopons(){
		//método statico para popular a lista!
		this.cupons = Arrays.asList("CUP01","CUP03","CUP04","CUP05");
	}
	
	public boolean validaCupom(String cupom){
		
		return this.cupons.contains(cupom);
	}
	
}
