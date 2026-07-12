package academy.devdojo.maratonjava.javacore.Gassociacao.Teste;

import academy.devdojo.maratonjava.javacore.Gassociacao.dominio.Treinador;

public class TreinadorTeste01 {
    public static void main(String[] args) {
        Treinador treinador01 = new Treinador("Ancelotti", "Brasil");
        Treinador treinador02 = new Treinador("Jorge", "Flamengo");
        Treinador treinador03 = new Treinador("Fabio", "Corinthians");
        Treinador[] treinadores = {treinador01, treinador02, treinador03};

        for (Treinador treinador : treinadores) {
            treinador.imprimir();
        }

    }
}
