package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        //quando passamos variaveis de tipo primitivo nunca passamos o seu local de memoria, mas sim uma cópia
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do calculadoraTest04");
        System.out.println(num1);
        System.out.println(num2);


    }
}
