package academy.devdojo.maratonjava.javacore.Csobrecargametodos.teste;

import academy.devdojo.maratonjava.javacore.Csobrecargametodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "tv", 12, "Ação");
        anime.imprime();

    }
}
