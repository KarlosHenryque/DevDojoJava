package academy.devdojo.maratonjava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonjava.javacore.Bintroducaometodos.dominio.Funcionarios;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();

        funcionario.nome = "Karlos";
        funcionario.idade = 21;
        funcionario.salarios = new double[]{1800, 1800, 1800};

        funcionario.imprimir();
    }
}
