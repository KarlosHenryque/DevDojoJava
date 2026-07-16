package academy.devdojo.maratonjava.javacore.Kenum.teste;

import academy.devdojo.maratonjava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonjava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonjava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente01 = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente01);
        TipoCliente tipoCliente02 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente02);
    }
}
