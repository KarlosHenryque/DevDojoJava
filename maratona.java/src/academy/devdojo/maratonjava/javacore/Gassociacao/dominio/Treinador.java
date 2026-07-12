package academy.devdojo.maratonjava.javacore.Gassociacao.dominio;

public class Treinador {
    private String nome;
    private String time;

    public Treinador(String nome, String time) {
        this.nome = nome;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public Treinador setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getTime() {
        return time;
    }

    public Treinador setTime(String time) {
        this.time = time;
        return this;
    }

    public void imprimir() {
        System.out.println("Nome: " +this.nome+ ", Time: " +this.time);
    }
}
