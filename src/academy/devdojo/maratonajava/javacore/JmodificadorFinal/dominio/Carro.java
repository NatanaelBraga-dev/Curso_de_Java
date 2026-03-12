package academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio;

public class Carro {
    private String nome;
    public final Comprador COMPRADOR = new Comprador();
    // o modificador final é utilizado para definir entidades que não podem ser herdadas, modificadas ou sobrescritas
    public static final double VELOCIDADE_LIMITE = 250;

    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
