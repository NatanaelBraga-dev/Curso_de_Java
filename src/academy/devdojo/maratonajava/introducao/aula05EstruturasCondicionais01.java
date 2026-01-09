package academy.devdojo.maratonajava.introducao;

public class aula05EstruturasCondicionais01 {
    public static void main(String[] args){
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade > 18;

        // !
        if(isAutorizadoComprarBebida == false){ // pode ser simplificado para !isAutorizadoComprarBebida
            System.out.println("Pode comprar Bebida alcóolica");
        }
        else{
            System.out.println("Não pode comprar bebida alcóolica");
        }

    }

}
