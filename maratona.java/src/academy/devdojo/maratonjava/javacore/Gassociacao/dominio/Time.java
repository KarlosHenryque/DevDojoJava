package academy.devdojo.maratonjava.javacore.Gassociacao.dominio;

public class Time {
    private String nome;

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Time setNome(String nome) {
        this.nome = nome;
        return this;
    }
}
