package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;


public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = "Midoriya";
        estudante.idade = 15;
        estudante.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 15;
        estudante02.sexo = 'M';

        impressora.imprime(estudante);
        impressora.imprime(estudante02);

        System.out.println("##################");

        impressora.imprime(estudante);
        impressora.imprime(estudante02);

    }
}
