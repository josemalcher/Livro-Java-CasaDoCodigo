package cap08.livraria;

public class Autor {
	String nome;
	String email;
	String cpf;
	
	public void mostraDetalhes(){
		System.out.println("Autor "+ nome);
		System.out.println("Autor email "+ email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
