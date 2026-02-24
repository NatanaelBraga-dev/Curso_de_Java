package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 bloco de inicialização é carrewgado ao carregar a classe
    // 1 alocado espaço em mamória para o objeto
    // 2 cada atributo de classe é criado e inicializado com valores default ou o que for definido
    // 3 bloco de inicialização é executado
    // 4 construtor é executado

    //executado apenas uma vez, já que é static
    static {
        System.out.println("dentro do bloco de inicialização");

        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("dentro do bloco de inicialização 2");
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){

        for (int episodio: Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome(){
        return nome;
    }

    public int[] getEpisodios(){
        return episodios;
    }


}
