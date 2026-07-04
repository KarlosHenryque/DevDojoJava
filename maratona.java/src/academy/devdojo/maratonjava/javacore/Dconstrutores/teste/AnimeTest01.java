package academy.devdojo.maratonjava.javacore.Dconstrutores.teste;

import academy.devdojo.maratonjava.javacore.Dconstrutores.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "tv", 12, "Ação\n");
        Anime anime02 = new Anime("Death Note", "HBO", 24, "Terror");

        anime.imprime();
        anime02.imprime();


    }
}
