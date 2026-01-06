package academy.devdojo.maratonajava.introducao;

public class aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / numero02; // possivel alternativa -> int resultado = numero01 / (double) numero02 -> vai transformar em double antes da operação

        double numero01Double = 10;
        double resultadoDouble = numero01Double / numero02; //aqui vai funcionar

        System.out.println(numero02 - numero01);
        System.out.println(numero02 + numero01 + "valor " + numero01 + numero02);
        System.out.println(resultado);
        System.out.println(resultadoDouble);

        // % -> operador de resto
        int resto = 20 % 2;
        System.out.println(resto);

        // (menor que) < e > (maior que) --- <= e >= (maior igual) == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;

        System.out.println("isDezMenorQueVinte ? " + isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte ? "+ isDezMaiorQueVinte);

        /*
        OPERADORES LÓGICOS
         */

        // && (AND)  || (or) !

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta ? " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta ? " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;

        float valorPlayStation = 5000F;

        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupança > valorPlayStation;
        System.out.println("isPlayStationCincoCompravel ? " + isPlayStationCincoCompravel);
    }
}
