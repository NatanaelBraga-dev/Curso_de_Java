package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class GerenciadorDeSeminarioTest01 {
    public static void main(String[] args) {
        Seminario seminario = new Seminario("Seminário de matemática");
        Aluno aluno = new Aluno("Natanael", 18);
        Aluno aluno2 = new Aluno("Alberto", 29);
        Professor professor = new Professor("Daniel", "Matemática");
        Local local = new Local("Avenida Franisco Sales 2229");
        Seminario seminario2 = new Seminario("Seminário de física");

        Aluno [] alunos = {aluno, aluno2};
        Seminario [] seminarios = {seminario, seminario2};

        seminario.setAluno(alunos);
        seminario.setProfessor(professor);
        professor.setSeminarios(seminarios);
        seminario.setLocal(local);

        seminario.imprimeDadosSeminario();
    }
}
