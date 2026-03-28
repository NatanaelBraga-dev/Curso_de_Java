package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

//Se eu não estiver utilizando nenhum atributo de classe nos meus metodos posso torna-los static, sendo assim não preciso mais instanciar sua classe para acessa-los
public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Calculando valor do imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getData_validade());
        }
    }
}
