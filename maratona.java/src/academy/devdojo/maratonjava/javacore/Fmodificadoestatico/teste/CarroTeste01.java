package academy.devdojo.maratonjava.javacore.Fmodificadoestatico.teste;

import academy.devdojo.maratonjava.javacore.Fmodificadoestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Bmw", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        System.out.println("Antigo limite de velocidade: " +Carro.getVelocidadeLimite());
        Carro.setVelocidadeLimite(180);
        System.out.println("Novo limite de velocidade: " +Carro.getVelocidadeLimite());

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
