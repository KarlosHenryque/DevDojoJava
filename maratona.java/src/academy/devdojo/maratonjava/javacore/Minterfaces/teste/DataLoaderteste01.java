package academy.devdojo.maratonjava.javacore.Minterfaces.teste;

import academy.devdojo.maratonjava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonjava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderteste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        fileLoader.remove();
        databaseLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
