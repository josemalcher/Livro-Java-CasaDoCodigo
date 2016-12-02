package cap07;

public class CarrinhoDeCompras {

private double total;

/*	public void adiciona(LivroFisico livro){
		System.out.println("Adiciona: " + livro);
	}
	public void adiciona(Ebook livro){
		System.out.println("Adiciona: " + livro);
	}*/
	
	public void adiciona(Produto produto){
		System.out.println("Adiciona: " + produto);
//		produto.aplicaDesconta(0.05);
		total += produto.getValor();
	}
	
	public double getTotal(){
		return total;
	}
	
}
