package academy.devdojo.maratonjava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonjava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonjava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto do computador");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " +produto.getNome());
        System.out.println("Valor: " +produto.getValor());
        System.out.println("Imposto a pagar: " +imposto);

        if (produto instanceof Tomate) {
            System.out.println("Data de validade: " +((Tomate) produto).getDataValidade()+ "\n");
        }
    }

}
