package academy.devdojo.maratonjava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dento do bloco de inicialização estático de pessoa");
    }
    {
        System.out.println("Dentro do bloco inicialização de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco inicialização de pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dento de construtor de pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = (nome);
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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Cpf: "+this.cpf);
        System.out.println("Endereço: "+this.endereco.getRua()+", Cep: "+this.endereco.getCep());
    }

}
