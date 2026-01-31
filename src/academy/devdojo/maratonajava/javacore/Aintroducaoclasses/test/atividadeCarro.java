package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class atividadeCarro {
    public static void main(String[] args) {
        Carro fiat = new Carro();
        fiat.nome = "Toro";
        fiat.modelo = "4x4";
        fiat.ano = 2020;

        Carro bmw = new Carro();
        bmw.nome = "C3";
        bmw.modelo = "coupe";
        bmw.ano = 2021;

        fiat = bmw;

        System.out.println("Carro 1");
        System.out.println(fiat.nome + " "+ fiat.modelo + " " + fiat.ano +"\n");
        System.out.println("Carro 2");
        System.out.println(bmw.nome + " " +  bmw.modelo + " " +  bmw.ano);
    }
}
