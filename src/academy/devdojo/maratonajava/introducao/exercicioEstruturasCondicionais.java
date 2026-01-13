package academy.devdojo.maratonajava.introducao;

public class exercicioEstruturasCondicionais {
    public static void main(String[] args) {
        //exercicio baseado na taxa salarial holandesa
        //será feito um cálculo de acordo com o salário
        double salario = 45000.00;
        double porcentagemDeImposto;

        if (salario > 0 && salario <= 34712) {
            porcentagemDeImposto = 9.70 / 100;
        } else if (salario >= 34713 && salario <= 68507) {
            porcentagemDeImposto = 37.35 / 100;
        } else {
            porcentagemDeImposto = 49.00 / 100;
        }

        double valorAPagarDeImposto = salario * porcentagemDeImposto;

        System.out.printf("o valor a pagar de imposto é: %.2f%n ", valorAPagarDeImposto );
        System.out.printf("salário liquido: %.2f ", salario - valorAPagarDeImposto);
    }
}
