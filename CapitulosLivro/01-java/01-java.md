### 1 - Java
Introdução direto com a manipução do código.

MeuPrimeiroPrograma.java

javac MeuPrimeiroPrograma.java

MeuPrimeiroPrograma.class é gerado

java MeuPrimeiroPrograma Executa o programa.

[Link do JDK para instalação](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

Conversões nos nomes dos arquivos: MeuPrimeiroPrograma (CamelCase)

[Code Conventions for the Java Programming Language](http://www.oracle.com/technetwork/java/index-135089.html)

##### Método main
É único.

```java
public static void main(String[] args){
  //código aqui
}
```
Passagem de parámetros:
```java
/*
Terminal
$ java MeuPrimeiroPrograma Java Stelio
*/

public static void main(String[] args){
  System.out.println("O primeiro de muitos códigos escritos em" + args[0] + " pelo " + args[1] " ! " );
}
```
[Site da comunidade Java Brasil para tirar dúvidas](http://guj.com.br)

##### IDE (Integrated Development Environment)

[Eclipse (recomendável)](https://www.eclipse.org/downloads/)

[NetBeans](https://netbeans.org/)

[Oracle JDeveloper](http://www.oracle.com/technetwork/developer-tools/jdev/downloads/index.html)

[IDEA - JetcBrains (pago)](https://www.jetbrains.com/idea/)

#####Primeiro Projeto

Pasta Workspace ficará todos os projetos;

Primeiro projeto "livraria"

NomeDoProjeto/bin -> localização dos bytescode compilados

#####Produtividade extrema
Criando uma classe MeuPrimeiroPrograma

Atalho do eclipse (Code Completion):

main (Control + Espaço) - Criar a classe principal main

syso (Control + Espaço - cira o System.out.println()

Control + F11 - Executar o código

Para saber mais sobre o Eclipse:

[Eclipse Users - Documentação](https://www.eclipse.org/users/)

[As três principais teclas de atalho do Eclipse](http://blog.caelum.com.br/as-tres-principais-teclas-de-atalho-do-eclipse/)

[Teclas de atalho essenciais no Eclipse](http://udgwebdev.com/teclas-de-atalho-essenciais-no-eclipse/)

##### Códigos do Livro e Grupo
[GitHub](https://github.com/Turini/livro-oo)

[Google Grupo](https://groups.google.com/d/forum/livro-java-oo)
