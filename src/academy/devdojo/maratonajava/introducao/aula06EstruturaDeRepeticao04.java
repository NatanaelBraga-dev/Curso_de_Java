package academy.devdojo.maratonajava.introducao;

public class aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valor parcela >= 1000

        int valorDoCarro = 100000;
        for(int parcela = 1; parcela <= valorDoCarro; parcela++){
            double valorParcela = valorDoCarro/parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+ parcela + " R$ " + valorParcela);
        }

    }
}
