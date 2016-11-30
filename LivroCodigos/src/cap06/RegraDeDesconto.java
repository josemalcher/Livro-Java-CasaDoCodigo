package cap06;

public class RegraDeDesconto {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Jose Malcher Jr.");
		
		Livro livro = new MiniLivro(autor);
		
		livro.setValor(39.90);
		
		if(!livro.aplicaDesconta(0.3)){
			System.out.println("Desconto não pode ser menor que 30%");
		}else{
			System.out.println("Valor do livro com desconto "+ livro.getValor());
		}
		
	}

}
