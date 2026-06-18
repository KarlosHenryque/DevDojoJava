package academy.devdojo.maratonjava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonjava.javacore.Aintroducaoclasses.dominio.Escola;
import academy.devdojo.maratonjava.javacore.Aintroducaoclasses.dominio.Estudante;
import academy.devdojo.maratonjava.javacore.Aintroducaoclasses.dominio.Professor;

public class EstudanteTest03 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Escola escola = new Escola();
        Professor professor = new Professor();

        estudante.nome = "Karlos";
        estudante.idade = 21;
        estudante.sexo =  'M';

        escola.nome = "Victorio";
        escola.endereco = "Rua Bartinik, 537";
        escola.cep = 8580555;

        professor.nome = "Jorge";
        professor.idade = 43;
        professor.sexo =  'M';

        System.out.println("Aluno");
        System.out.println("Nome: " +estudante.nome+ ", idade: " +estudante.idade+ " e sexo: " +estudante.sexo);
        System.out.println("Professor");
        System.out.println("Nome: " +professor.nome+ ", idade: " +professor.idade+ " e sexo: " +professor.sexo);
        System.out.println("Escola");
        System.out.println("Nome: " +escola.nome+ ", endereço: " +escola.endereco+ " e CEP: " +escola.cep);
    }
}
