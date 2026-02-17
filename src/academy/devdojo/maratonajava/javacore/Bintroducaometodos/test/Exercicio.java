package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class Exercicio {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Natanael Braga");
        funcionario.setIdade(19);

        funcionario.setSalarios(new double[]{1000,1000,3000});

        funcionario.infoDados();
        funcionario.mediaSalarios();
        System.out.println(funcionario.mediaSalarios());
    }
}
