package academy.devdojo.maratonjava.javacore.Npolimorfismo.Teste;

import academy.devdojo.maratonjava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonjava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonjava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonjava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        System.out.println("----------------------------------");

        Tomate tomate = new Tomate("Americano", 3);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);

    }
}
