package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo <> e imprima a seguinte mensagem:

Eu <nome>, morando no <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */

public class aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Natanael";
        String endereco = "Rua G Barbosa 3334";
        double salario = 5431.12;
        String data = "01/04";

        System.out.println("Eu "+ nome+ " morando no "+ endereco + ", confirmo que recebi que recebi o salario de "+ salario + ", na data "+ data);
    }
}
