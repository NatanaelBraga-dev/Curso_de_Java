package academy.devdojo.maratonajava.introducao;

public class aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //imprima o dia da semana considerando que domingo é 1

        byte dia = 5;

        switch (dia){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}
