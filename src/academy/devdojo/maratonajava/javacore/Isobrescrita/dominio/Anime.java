package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

import javax.print.DocFlavor;

public class Anime extends Object{
    private String nome;

    @Override
    public String toString(){
        return nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
