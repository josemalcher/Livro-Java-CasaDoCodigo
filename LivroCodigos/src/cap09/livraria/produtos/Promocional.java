package cap09.livraria.produtos;
@FunctionalInterface
public interface Promocional {

	boolean aplicaDesconta(double porcentagem);
	
	default boolean aplicaDesconto10Porcento(){
		return aplicaDesconta(0.1);
	}
	
	//boolean naoSouMaisUmaInterfaceFuncional();
	
}
