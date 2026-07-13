package academy.devdojo.maratonjava.javacore.Gassociacao.Teste;

import academy.devdojo.maratonjava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonjava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonjava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonjava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 21);
        Aluno[] alunosParaSeminario = {aluno};
        Professor professor = new Professor("Barba Branca", "Pirata");
        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);
        Seminario[] seminariosDisponivel = {seminario};
        professor.setSeminarios(seminariosDisponivel);

        professor.imprime();
    }
}
