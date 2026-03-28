package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import java.util.ArrayList;
import java.util.List;


public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Kuririn");
        list.add("Vegeta");
    }
}
