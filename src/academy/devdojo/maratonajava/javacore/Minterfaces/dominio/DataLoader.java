package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    //são por padrão public a abstract
    void load();
    //pode ver abaixo que o java acusa redundancia pois por padrão já são esses valores
    public static final int MAX_DATA_SIZE = 10;

    public default void checkPermissions(){
        System.out.println("fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize da interface");
    }
}
