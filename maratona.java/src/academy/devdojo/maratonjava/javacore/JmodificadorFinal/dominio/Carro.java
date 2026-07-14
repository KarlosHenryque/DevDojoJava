package academy.devdojo.maratonjava.javacore.JmodificadorFinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 150;
    public final Comprador COMPRADOR = new Comprador();

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome do carro: "+this.nome);
    }
}
