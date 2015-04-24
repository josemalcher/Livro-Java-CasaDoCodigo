package cap2;

public class CalculadoraDeEstoque {

	public static void main(String[] args) {

		
		/*
		double livroJava = 39.90;
		double livroPHP = 29.80;
		
		double soma = livroJava + livroPHP;
		
		System.out.println("O total é " + soma);
		*/
		
		//adicionando loop while
		double soma = 0;
		int contador = 0;
		while (contador < 35){
			double valorDoLivro = 59.90;
			//soma = soma + valorDoLivro;
			soma += valorDoLivro;
			//contador = contador + 1;
			contador ++;
		}
		// ou usando o for
		
		double soma2 = 0;
		for(int contador2 = 0; contador2 < 35 ; contador2++){
			soma2 += 59.90;
		}
		
		
		
		//adicionando condicionais
		
		/*
		if(soma < 150){
			System.out.println("Estoque baixo!");
		}else{
			System.out.println("Estoque ok!");
		}
		*/
		if(soma < 150){
			System.out.println("Estoque baixo!");
		}else if(soma >= 2000){
			System.out.println("Estoque ALTO!");
		}else{
			System.out.println("Estoque estpa bom");
		}
		
		//operador Ternário
		
		double v1 = 12;
		double v2 = 10;
		double valor = v1 > v2 ? 100 : 0;
		System.out.println("Valor é "+valor);
		/*
		 mesmo que
		 
		 double valor = 0;
		 if(v1 > v2){
		 	valor = 100;
		 }else{
		 	valor = 0;
		 }
		 
		 */
		
	}

}
