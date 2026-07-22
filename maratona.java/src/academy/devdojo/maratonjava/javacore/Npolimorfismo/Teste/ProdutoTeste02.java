package academy.devdojo.maratonjava.javacore.Npolimorfismo.Teste;

import academy.devdojo.maratonjava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonjava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonjava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("----------------------------------");

        Produto tomate = new Tomate("Americano", 3);
        System.out.println(tomate.getNome());
        System.out.println(tomate.getValor());
        System.out.println(tomate.calcularImposto());
    }
}
