package academy.devdojo.maratonjava.javacore.Lclassesabstratas.teste;

import academy.devdojo.maratonjava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonjava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonjava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Lukinha", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();

    }
}
