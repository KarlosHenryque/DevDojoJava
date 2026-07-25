package academy.devdojo.maratonjava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonjava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivos implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo");
    }
}
