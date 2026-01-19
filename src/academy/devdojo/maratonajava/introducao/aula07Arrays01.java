package academy.devdojo.maratonajava.introducao;

public class aula07Arrays01 {
    public static void main(String[] args) {
        // na sintaxe colocamos o numero de caracteres que vão ficar no array e precisamos definir o tipo de variavel que vai estar lá
        int[] idades = new int [3];
        idades[0] = 20;
        idades[1] = 23;
        idades[2] = 30;
        // idades[3] = 40; --> isso da erro, pois só podemos ter 3 itens no array
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
