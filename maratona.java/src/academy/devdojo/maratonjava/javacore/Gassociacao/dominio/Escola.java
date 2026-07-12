package academy.devdojo.maratonjava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public Escola setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public Escola setProfessores(Professor[] professores) {
        this.professores = professores;
        return this;
    }

    public void imprime() {
        System.out.println("Nome da escola: " +this.nome);
        if (professores == null) {
            return;
        }
        for (Professor professor : professores) {
            System.out.println("Nome dos professores: " +professor.getNome());
        }
    }
}
