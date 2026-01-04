package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        //basicamente a diferença entre eles é a quantidade possivel de armazenar em memória
        int idade = 10;
        long numeroGrande = 100000;
        double salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "um grande texto"; //string não é um tipo primitivo, mas sim uma classe
 
        System.out.println(nome);
        System.out.println("A idade é "+ idade);
    }
}
