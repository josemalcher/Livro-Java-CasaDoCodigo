package cap08.livraria.produtos;

import cap08.livraria.Autor;

public class LivroFisico extends Livro implements Promocional{

	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public double getTaxaImpressao(){
		return this.getValor() * 0.05;
	}

	@Override
	public boolean aplicaDesconta(double porcetagem) {
		
		if(porcetagem > 0.3){
			return false;
		}
		double desconto = getValor() * porcetagem;
		setValor(getValor()- desconto);
		System.out.println("aplicando desconto LivroFIsico");
		
		return true;
	}

	
	
}
