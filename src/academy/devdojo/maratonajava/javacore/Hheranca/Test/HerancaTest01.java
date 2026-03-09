package academy.devdojo.maratonajava.javacore.Hheranca.Test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua do apocalipse");
        endereco.setCep("01234-209");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Seila do ordones");
        funcionario.setCpf("112233334-34");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(13000);
        System.out.println("------------------");
        funcionario.imprime();
    }
}
