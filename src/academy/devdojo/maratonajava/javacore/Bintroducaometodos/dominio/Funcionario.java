package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void infoDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios != null){
            for (double salario : salarios) {
                System.out.println(salario);
            }
        }
    }

    public double mediaSalarios(double[] salarios){
       double valorTotal = 0;
       if(salarios != null){
           for (double salario: salarios){
               valorTotal+=salario;
           }
       }
        double mediaDosSalarios = valorTotal/salarios.length;
        return mediaDosSalarios;
    }
}
