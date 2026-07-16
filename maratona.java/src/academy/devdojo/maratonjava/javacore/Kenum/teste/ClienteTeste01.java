package academy.devdojo.maratonjava.javacore.Kenum.teste;

import academy.devdojo.maratonjava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonjava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
