package academy.devdojo.maratonjava.exercicios.execicio02.teste;

import academy.devdojo.maratonjava.exercicios.execicio02.dominio.Carro;
import academy.devdojo.maratonjava.exercicios.execicio02.dominio.Moto;

public class VeiculoTeste {
    public static void main(String[] args) {
        Carro carro = new Carro(2007, "Honda", "Civic");
        Moto moto = new Moto(2013, "Yamaha", "MT-07");

        moto.ligar();
        moto.desligar();
        System.out.println();
        carro.ligar();
        carro.desligar();
    }
}
