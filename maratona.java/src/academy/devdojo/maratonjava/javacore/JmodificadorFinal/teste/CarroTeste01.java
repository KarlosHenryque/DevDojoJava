package academy.devdojo.maratonjava.javacore.JmodificadorFinal.teste;

import academy.devdojo.maratonjava.javacore.JmodificadorFinal.dominio.Carro;
import academy.devdojo.maratonjava.javacore.JmodificadorFinal.dominio.Comprador;
import academy.devdojo.maratonjava.javacore.JmodificadorFinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
