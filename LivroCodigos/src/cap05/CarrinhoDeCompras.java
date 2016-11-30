package cap05;

public class CarrinhoDeCompras {

private double total;

/*	public void adiciona(LivroFisico livro){
		System.out.println("Adiciona: " + livro);
	}
	public void adiciona(Ebook livro){
		System.out.println("Adiciona: " + livro);
	}*/
	
	public void adiciona(Livro livro){
		System.out.println("Adiciona: " + livro);
		livro.aplicaDesconta(0.05);
		total += livro.getValor();
	}
	
	public double getTotal(){
		return total;
	}
	
}
