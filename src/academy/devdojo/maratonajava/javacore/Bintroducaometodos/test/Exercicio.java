package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class Exercicio {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Natanael Braga";
        funcionario.idade = 19;

        funcionario.salarios = new double[]{1000,1000,3000};

        funcionario.infoDados();
        funcionario.mediaSalarios(funcionario.salarios);
        System.out.println(funcionario.mediaSalarios(funcionario.salarios));
    }
}
