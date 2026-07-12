package academy.devdojo.maratonjava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Jogador setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Time getTime() {
        return time;
    }

    public Jogador setTime(Time time) {
        this.time = time;
        return this;
    }

    public void imprimir() {
        System.out.println("Nome: "+this.nome);
        if (time != null) {
            System.out.println("Time: "+time.getNome());
        } else {
            System.out.println("Sem time :( \n");
        }
    }
}
