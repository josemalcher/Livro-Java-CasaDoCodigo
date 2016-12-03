package cap08.livraria.produtos;

import cap08.livraria.Autor;

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
	
}
