package academy.devdojo.maratonjava.javacore.Gassociacao.Teste;

import academy.devdojo.maratonjava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonjava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção brasileira");
        jogador1.imprimir();

        jogador1.setTime(time);
        jogador1.imprimir();


    }
}
