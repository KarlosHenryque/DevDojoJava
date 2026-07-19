package academy.devdojo.maratonjava.exercicios.execicio02.dominio;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(int ano, String marca, String modelo) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void ligar();
    public abstract void desligar();
}
