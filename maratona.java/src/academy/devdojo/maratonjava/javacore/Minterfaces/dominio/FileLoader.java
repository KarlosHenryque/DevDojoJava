package academy.devdojo.maratonjava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivos ");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo");
    }
}
