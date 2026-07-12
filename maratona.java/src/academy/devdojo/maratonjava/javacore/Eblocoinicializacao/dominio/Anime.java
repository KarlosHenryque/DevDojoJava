package academy.devdojo.maratonjava.javacore.Eblocoinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i + 1;
        }
        for (int episodio: this.episodios) {
            System.out.printf(episodio + " ");
        }
        System.out.println();
    }

    public Anime(String nome, int[] episodios) {
        this.nome = nome;
        this.episodios = episodios;
    }

    public String nome() {
        return nome;
    }

    public int[] episodios() {
        return episodios;
    }

}
