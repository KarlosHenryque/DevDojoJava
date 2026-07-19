package academy.devdojo.maratonjava.exercicios.execicio01.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.1;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", bônus=" + calcularBonus() +
                '}';
    }
}
