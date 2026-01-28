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

        System.out.println("Carro 1 \n");
        System.out.println(fiat.nome + " "+ fiat.modelo + " " + fiat.ano);
        System.out.println("Carro 2 \n");
        System.out.println(bmw.nome + " " +  bmw.modelo + " " +  bmw.ano);
    }
}
