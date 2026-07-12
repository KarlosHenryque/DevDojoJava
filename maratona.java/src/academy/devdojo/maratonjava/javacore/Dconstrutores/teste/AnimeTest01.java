package academy.devdojo.maratonjava.javacore.Dconstrutores.teste;

import academy.devdojo.maratonjava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "tv", 12, "Ação");
        Anime anime02 = new Anime("Death Note", "HBO", 24, "Terror");
        Anime anime03 = new Anime("Death Note", "HBO", 24, "Terror", "03");

        anime.imprime();
        anime02.imprime();
        anime03.imprime();


    }
}
