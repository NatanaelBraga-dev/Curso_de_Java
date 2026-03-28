package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.6;
    private String Data_validade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getData_validade() {
        return Data_validade;
    }

    public void setData_validade(String data_validade) {
        Data_validade = data_validade;
    }
}
