package academy.devdojo.maratonjava.exercicios.execicio02.dominio;

public class Moto extends Veiculo{
    public Moto(int ano, String marca, String modelo) {
        super(ano, marca, modelo);
    }

    @Override
    public void ligar() {
        System.out.println("Moto " +this.marca+ " " +this.modelo+ " foi ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Moto " +this.marca+ " " +this.modelo+ " foi desligado");
    }
}

