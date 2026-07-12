package academy.devdojo.maratonjava.javacore.Gassociacao.Teste;

import academy.devdojo.maratonjava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonjava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Jiraya Sensei");
        Professor professor02 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor01, professor02};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
