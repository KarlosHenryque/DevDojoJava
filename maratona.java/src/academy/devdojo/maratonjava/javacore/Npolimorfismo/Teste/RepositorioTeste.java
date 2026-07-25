package academy.devdojo.maratonjava.javacore.Npolimorfismo.Teste;
import academy.devdojo.maratonjava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonjava.javacore.Npolimorfismo.servico.RepositorioArquivos;
import academy.devdojo.maratonjava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonjava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio  repositorioA = new RepositorioArquivos();
        Repositorio  repositorioB = new RepositorioBancoDeDados();
        Repositorio  repositorioM = new RepositorioMemoria();

        repositorioB.salvar();
        repositorioA.salvar();
        repositorioM.salvar();
    }
}
