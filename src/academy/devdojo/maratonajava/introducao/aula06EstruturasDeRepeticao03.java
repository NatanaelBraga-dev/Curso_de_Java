package academy.devdojo.maratonajava.introducao;

public class aula06EstruturasDeRepeticao03 {
    //imprima os primeiros 25 numeros de um dado espaço de valores
    public static void main(String[] args) {
        int numeroInicial = 30;
        int numeroFinal = 50;
        int iterador = 0;

        do {
            if (numeroInicial <= numeroFinal){
                System.out.println(numeroInicial);
                numeroInicial = numeroInicial + 1;
                iterador+=1;
            }else {
                System.out.println("o limite do numero final foi ultrapassado");
                break;
            }
        }while(iterador <= 25);
    }
}
