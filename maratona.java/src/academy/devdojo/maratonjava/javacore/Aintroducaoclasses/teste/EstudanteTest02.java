package academy.devdojo.maratonjava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonjava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Karlos";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println("Nome: " +estudante.nome+ ", idade: " +estudante.idade+ " e sexo: " +estudante.sexo);

        estudante2.nome = "Maquinho";
        estudante2.idade = 35;
        estudante2.sexo = 'M';

        System.out.println("Nome: " +estudante2.nome+ ", idade: " +estudante2.idade+ " e sexo: " +estudante2.sexo);
    }
}
