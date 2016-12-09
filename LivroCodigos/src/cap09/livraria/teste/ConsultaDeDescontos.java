package cap09.livraria.teste;

import cap09.livraria.produtos.GerenciadorDeCopons;

public class ConsultaDeDescontos {

	public static void main(String[] args) {
		
		GerenciadorDeCopons gerenciador = new GerenciadorDeCopons();
		
		if(gerenciador.validaCupom("CUP21")){
			System.out.println("Cupom de desconto valido");
		}else{
			System.out.println("Não VALIDO!");
		}

	}

}
