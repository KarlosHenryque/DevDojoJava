package academy.devdojo.maratonjava.exercicios.execicio02.dominio;

public class Carro extends Veiculo{
    public Carro(int ano, String marca, String modelo) {
        super(ano, marca, modelo);
    }

    @Override
    public void ligar() {
        System.out.println("Carro " +this.marca+ " " +this.modelo+ " foi ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Carro " +this.marca+ " " +this.modelo+ " foi desligado");
    }
}

