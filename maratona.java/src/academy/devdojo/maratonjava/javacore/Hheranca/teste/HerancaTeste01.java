package academy.devdojo.maratonjava.javacore.Hheranca.teste;

import academy.devdojo.maratonjava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonjava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonjava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        System.out.println("Dados da pessoa");
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("80857-075");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("\nDados do funcionário");
        Funcionario funcionario = new Funcionario();
        Endereco endereco02 = new Endereco();
        funcionario.setNome("Juninho");
        funcionario.setCpf("321152225");
        endereco02.setRua("Rua Santa");
        endereco02.setCep("12345978");
        funcionario.setEndereco(endereco02);
        funcionario.setSalario(2.000);
        funcionario.imprime();
    }
}
