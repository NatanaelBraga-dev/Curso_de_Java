package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante.nome = "Midoriya";
        estudante.idade = 15;
        estudante.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 15;
        estudante02.sexo = 'M';

        estudante.imprime();
        estudante02.imprime();
    }
}
