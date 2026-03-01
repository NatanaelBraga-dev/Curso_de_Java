package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] aluno;
    private Local local;
    private Professor professor;

    public Seminario(String nomeSeminario) {
        this.titulo = nomeSeminario;
    }

    public void imprimeDadosSeminario(){
        System.out.println("INFORMAÇÕES SOBRE O SEMINÁRIO");
        System.out.println("--------------------------------");
        System.out.println(getTitulo());

        System.out.println("--------------------------------");
        System.out.println("ALUNOS DO SEMINÁRIO");
        if (aluno != null){
            for(Aluno alunos: aluno){
                System.out.println(alunos.getNome());
            }
        }
        else {
            System.out.println("Esse seminario ainda não possui alunos");
        }
        System.out.println("--------------------------------");

        System.out.println("PROFESSOR DO SEMINÁRIO");
        professor.imprimirDadosProfessor();
        System.out.println("--------------------------------");
        System.out.println("LOCAL DO SEMINÁRIO");
        System.out.println("local: " + local.getEndereco());
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String nomeSeminario) {
        this.titulo = nomeSeminario;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
