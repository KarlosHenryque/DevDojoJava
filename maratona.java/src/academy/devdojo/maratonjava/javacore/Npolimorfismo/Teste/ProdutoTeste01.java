package academy.devdojo.maratonjava.javacore.Npolimorfismo.Teste;

import academy.devdojo.maratonjava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonjava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonjava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 11.000);
        Tomate tomate = new Tomate("Tomate cereja", 10);

        CalculadoraImposto.calcularImpostoComputador(computador);
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
