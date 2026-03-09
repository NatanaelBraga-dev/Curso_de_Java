package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    // da acesso ao atributo a toda classe do mesmo diretorio ou toda classe que extend de Pessoa
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("dentro do bloco de inicialização estático de Pessoa");
    }

    {
        System.out.println("dentro do bloco de inicialização não estático de Pessoa 1");
    }
    {
        System.out.println("dentro do bloco de inicialização não estático de Pessoa 2");
    }

    public Pessoa (String nome){
        System.out.println("Dentro do construtor de Pessoa");
        this.nome = nome;
    }

    public Pessoa (String nome, String cpf){
        //sempre que se chama um construtor em um construtor, precisa ser a primeira linha
        this(nome);
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep() );
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
}
