package cap09.livraria.teste;

import java.util.ArrayList;
import java.util.List;

import cap09.livraria.produtos.Produto;


public class CarrinhoDeCompras {

	private double total;
	/*private Produto[] produtos = new Produto[10];
	private int contador = 0;*/
	private List<Produto> produtos;

	public CarrinhoDeCompras(){
		this.produtos = new ArrayList<Produto>();
	}
	
	public void adiciona(Produto produto) {
		/*System.out.println("Adicionado - " + produto);
		this.produtos[contador] = produto;
		contador++;
		this.total += produto.getValor();*/
		this.produtos.addAll(produtos);
	}

	public double getTotal() {
		return total;
	}

	/*public Produto[] getProdutos() {
		return produtos;
	}*/
	public List<Produto> getProdutos(){
		return produtos;
	}
	
	
	

}
