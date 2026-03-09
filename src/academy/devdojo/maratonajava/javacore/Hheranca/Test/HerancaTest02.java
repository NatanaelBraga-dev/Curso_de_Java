package academy.devdojo.maratonajava.javacore.Hheranca.Test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {

    // 0 bloco de inicialização estático da super classe é carregado quando a JVM carregar a classe pai
    // 1 bloco de inicialização estático da sub classe é carregado quando a JVM carregar a classe filha
    // 2 alocado espaço em mamória para o objeto da superclasse pai
    // 3 cada atributo da superclasse é criado e inicializado com valores default ou o que for passado
    // 4 bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 construtor é executado da superclasse
    // 6 alocado espaço em mamória para o objeto da subclasse pai
    // 7 cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
    // 4 bloco de inicialização da subclasse é executado na ordem em que aparece
    // 5 construtor é executado da subclasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("qualquer nome");

    }
}
