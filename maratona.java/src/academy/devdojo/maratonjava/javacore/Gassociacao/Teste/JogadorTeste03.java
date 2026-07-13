package academy.devdojo.maratonjava.javacore.Gassociacao.Teste;

import academy.devdojo.maratonjava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonjava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Cafu");
        Jogador jogador02 = new Jogador("Pelé");
        Jogador[] jogadores = {jogador01, jogador02};

        Time time = new Time("Brasil");
        jogador01.setTime(time);
        jogador02.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador01.imprimir();
        jogador02.imprimir();

        System.out.println("\n--- Time ---");
        time.imprime();

    }
}
