package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

//A variavel de referencia não precisa ser do mesmo tipo do objeto instanciado, nesse caso a var tipo Produto referencia um objeto Computador ou Tomate
public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setData_validade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }

}
/*
* Widening Cast é um cast implicito que fizemos nesse trecho:
        Produto produto = new Computador("Ryzen 9", 3000);
*
* podemos observar que o java não precisa perguntar se isso está correto ou não porque o tipo Produto é superClass da subClass Computador,
* ou seja, um computador sempre vai caber em um tipo produto
*
* Narrowing Cast é um cast explicito que fizemos nesse trecho:
*       Tomate tomate = (Tomate) produto;
*
* se não especificarmos com parêntesis o que estamos fazendo "(Tomate)" o java vai alertar dizendo que estamos tentando colocar um valor
* do tipo Produto que é superClass do tipo Tomate ou seja isso pode dar errado, pois nem sempre um Produto vai caber em um tomate, já que
* Produto é suoerClass de Tomate
* */