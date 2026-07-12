package academy.devdojo.maratonjava.javacore.Fmodificadoestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicialização 01");
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i + 1;
        }
        for (int episodio: Anime.episodios) {
            System.out.printf(episodio + " ");
        }
        System.out.println();
    }

    static {
        System.out.println("Dentro do bloco de inicialização 02");
    }

    static {
        System.out.println("Dentro do bloco de inicialização 03");
    }

    public String nome() {
        return nome;
    }

    public int[] episodios() {
        return episodios;
    }

}
