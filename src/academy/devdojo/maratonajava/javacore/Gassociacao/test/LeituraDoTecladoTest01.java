package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {

        //abaixo a classe que utilizamos para pegar dados a partir de um input
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo");
        String nome = input.nextLine();
        System.out.println("Digite sua idade");
        int idade = input.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char sexo = input.next().charAt(0);
        System.out.println("----------------");
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("sexo: " + sexo);
    }
}
