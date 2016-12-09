package cap09.livraria.produtos;

import cap09.livraria.Autor;

public class Ebook extends Livro implements Promocional{


	public Ebook(Autor autor) {
		super(autor);
	}


	private String waterMark;
	
	
	public String getWaterMark(){
		return waterMark;
	}


	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	//Ao anotar nosso método com @Override, o código não compilará
	//caso esse método não exista na classe pai (superclasse).
	@Override
	public boolean aplicaDesconta(double porcetagem){
		if(porcetagem > 0.15){
			return false;
		}
				
		double desconto = this.getValor() * porcetagem;
		this.setValor(this.getValor() - desconto);
		
		//this.valor -= this.valor * porcetagem;
		
		return true;
		//System.out.println("aplicando desconto no ebook");
		//return super.aplicaDesconta(porcetagem);
	}


	@Override
	public String toString() {
		return "Eu sou um ebook";
	}


	@Override
	public int compareTo(Produto outro) {
		if(this.getValor() < outro.getValor()){
			return -1;
		}
		if(this.getValor() > outro.getValor()){
			return 1;
		}
		return 0;
	}
	
	
	
}
