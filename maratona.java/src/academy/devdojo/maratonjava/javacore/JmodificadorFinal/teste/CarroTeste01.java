package academy.devdojo.maratonjava.javacore.JmodificadorFinal.teste;

import academy.devdojo.maratonjava.javacore.JmodificadorFinal.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }
}
