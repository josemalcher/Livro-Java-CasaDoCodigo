package cap08.livraria.produtos;

import cap08.livraria.Editora;

public class Revista implements Produto, Promocional{

	private String nome;
	private String descricao;
	private double valor;
	private Editora editora;
	
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean aplicaDesconta(double porcetagem) {
		
		if(porcetagem > 0.1){
			return false;
		}
		double desconto = getValor() * porcetagem;
		setValor(getValor()- desconto);
		
		System.out.println("aplicando desconto LivroFIsico");
		
		return true;
	}
	@Override
	public double getValor() {
		return this.getValor();
	}


}
