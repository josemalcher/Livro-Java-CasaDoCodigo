package cap02;

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		double livroJava8;
		double LivroTDD;
		
		livroJava8 = 59.99;
		LivroTDD = 58.88;
		
		double soma = livroJava8 + LivroTDD;
		
		System.out.println("Total em estoque é R$ "+ soma);
		
		//Tipos primitivos
		
		byte inteiro1 = 10;
		short inteiro2 = 10;
		int inteiro3 = 10;
		long inteiro4 = 10;
		
		//tipos não primitivos
		System.out.println("String");
		String texto = "Uma String";
		System.out.println(texto);
		
		//condicionais
		if(soma < 150){
			System.out.println("Estoque está baixo");
		}else{
			System.out.println("Estoque OK");
		}
		
		//operador Ternário
		double v1 = 10;
		double v2 = 20;
		double valor;
		if(v1 > v2){
			 valor = 100;
		}else{
			valor = 10;
		}
		double valorTernario = v1 > v2 ? 100: 10;
		
		System.out.println("**********");
		
		//Loopings
		
		double somaL = 0;
		double contador = 0;
		while(contador < 35){
			double valorDoLivro = 59.9;
			//somaL = soma + valorDoLivro;
			somaL += valorDoLivro;
			//contador = contador + 1;
			contador++;
		}
		System.out.println(somaL);
		
		double somaFor = 0;
		for(int i = 0 ; i < 5 ; i++){
			somaFor += 10;
		}
		System.out.println(somaFor);
		
		System.out.println("***********");
		//COntinue e Break
		for(int i = 0 ; i < 10 ; i++){
			if(i == 7){
				//continue;
				break;
			}
			System.out.println(i);
		}
		
		
	}
}
