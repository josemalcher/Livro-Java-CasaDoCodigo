package cap05;

public class RegraDeDesconto {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Jose Malcher Jr.");
		
		Livro livro = new Livro(autor);
		
		livro.setValor(59.90);
		
		if(!livro.aplicaDesconta(0.3)){
			System.out.println("Desconto não pode ser menor que 30%");
		}else{
			System.out.println("Valor do livro com desconto "+ livro.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		
		ebook.setValor(29.90);
		
		if(!ebook.aplicaDesconta(0.15)){
			System.out.println("Desconto não pode ser menor que 15%");
		}else{
			System.out.println("Valor do ebook com desconto "+ ebook.getValor());
		}
		

	}

}
