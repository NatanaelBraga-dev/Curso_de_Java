package academy.devdojo.maratonajava.introducao;

public class aula05EstruturasCondicionais03 {
    public static void main(String[] args){
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        //operador ternário
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

//        if(salario > 5000){
//            resultado = mensagemDoar;
//        }else {
//            resultado = mensagemNaoDoar;
//        }
        System.out.println(resultado);

    }
}
