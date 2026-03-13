package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int identificadorNumerico;
    private String nomeRelatorio;

    TipoCliente(int identificadorNumerico, String nomeRelatorio) {
        this.identificadorNumerico = identificadorNumerico;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClienteporIdentificador(String nomeRelatorio){
        for(TipoCliente tipoCliente : values()){
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public int getIdentificadorNumerico() {
        return identificadorNumerico;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
