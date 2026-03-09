package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("dentro do bloco de inicialização estático de Funcionario");
    }

    {
        System.out.println("dentro do bloco de inicialização não estático de Funcionario 1");
    }
    {
        System.out.println("dentro do bloco de inicialização não estático de Funcionario 2");
    }

    public void imprime(){
        // executa o metodo da superclass
        super.imprime();
        System.out.println(this.salario);
    }

    public Funcionario (String nome){
        super(nome);
    }

    public void relatorioPagamento(){
        System.out.println("Eu" + this.nome + " Recebi salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
