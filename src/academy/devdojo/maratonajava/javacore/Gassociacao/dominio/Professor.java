package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import java.sql.SQLOutput;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprimirDadosProfessor(){
        System.out.println(getNome());
        System.out.println(getEspecialidade());
        if (seminarios != null){
            System.out.println("--------------------------------");
            System.out.println("SEMINÁRIOS DO PROFESSOR:");
            for(Seminario seminario: seminarios){
                System.out.println( seminario.getTitulo());
            }

        }else {
            System.out.println("Esse professor não tem seminários");
        }

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminarios() {
        return this.seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
