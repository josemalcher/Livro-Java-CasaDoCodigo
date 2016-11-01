package cap04;

public class CadastroDeLivros {

	public static void main(String[] args) {
		
	/*	Autor autor = new Autor();
		autor.nome = "Jose Malcher Jr.";
		autor.email = "email@gmail.com";
		autor.cpf = "123.123.123-4";*/
		
		Livro livro = new Livro();
		livro.nome = "Java 8";
		livro.descricao = "Novos recursos";
		livro.valor = 59.9;
		livro.isbn = "123-123-123";
	//	livro.autor = autor;
		
/*		System.out.println(livro.nome);
		System.out.println(livro.descricao);
		System.out.println(livro.valor);
		System.out.println(livro.isbn);
		*/
		livro.mostraDetalhes();
		
		Autor autor2 = new Autor();
		autor2.nome = "Malcher Jr.";
		autor2.email = "emailemail@gmail.com";
		autor2.cpf = "123.444.123-4";
		
		Livro livro2 = new Livro();
		livro2.nome = "Java FX";
		livro2.descricao = "Novos recursos visuais";
		livro2.valor = 39.9;
		livro2.isbn = "223-323-223";
		livro2.autor = autor2;
		
/*		System.out.println(livro2.nome);
		System.out.println(livro2.descricao);
		System.out.println(livro2.valor);
		System.out.println(livro2.isbn);*/
		livro2.mostraDetalhes();
		
		System.out.println("*******");
		System.out.println("*** Aplicando Desconto****");
		livro.aplicaDesconta(0.5);
		livro.mostraDetalhes();
		
		
	}
	
	
}

