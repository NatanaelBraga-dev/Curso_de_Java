package academy.devdojo.maratonajava.introducao;

public class aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double = 0 valor de inicializacao
        //char '\u0000' ''
        //boolean = false
        //String null

        // boolean[] idades = new boolean[3]; //sendo inicializado

       // System.out.println(idades[0]);
      //  System.out.println(idades[1]);
       // System.out.println(idades[2]);

        String [] nomes = new String[3];
        nomes[0] = "Zé gotinha";
        nomes[1] = "janaíno";
        nomes[2] = "Lucas de Andrade";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
