package cap04;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.valor = 60.0;

		System.out.println("Valor atual R$ " + livro.valor);

		if (!livro.aplicaDesconta(0.5)) {
			System.out.println("Desconto não pode ser maior que 30%");
		} else {
			System.out.println("Valor com desconto " + livro.valor);
		}

	}

}
