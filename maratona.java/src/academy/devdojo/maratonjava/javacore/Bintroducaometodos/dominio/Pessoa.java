package academy.devdojo.maratonjava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        setIdade(idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade){
        if (idade <= 0) {
            System.out.println("idade invalida");
            return;
        }
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void imprime() {
        System.out.printf("Nome: %s e idade %d \n", this.nome, this.idade);
    }
}
