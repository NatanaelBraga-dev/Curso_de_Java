package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {

    private String nome;
    private double velocidadeMaxima;
    //ao alterar esse valor, ele muda o valor para todas as instancias da classe, não somente para um objeto/instancia
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public void imprime (){
        System.out.println("-------------");
        System.out.println("Nome" + this.nome);
        System.out.println("velocidade Maxima" + this.velocidadeMaxima);
        System.out.println("velocidade Limite" + Carro.velocidadeLimite);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }
}
