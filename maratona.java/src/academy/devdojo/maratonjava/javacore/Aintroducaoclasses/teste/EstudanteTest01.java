package academy.devdojo.maratonjava.javacore.Aintroducaoclasses.teste;
import academy.devdojo.maratonjava.javacore.Aintroducaoclasses.dominio.Escola;
import academy.devdojo.maratonjava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Escola escola = new Escola();

        estudante.nome = "Karlos";
        estudante.idade = 21;
        estudante.sexo =  'M';

        escola.nome = "Victorio";
        escola.endereco = "Rua Bartinik, 537";
        escola.cep = 8580555;

        System.out.println("Dados do aluno: ");
        System.out.println("Nome: " +estudante.nome);
        System.out.println("Idade: " +estudante.idade);
        System.out.println("Sexo: " +estudante.sexo);

        System.out.println("\nDados da escola: ");
        System.out.println("Nome da escola: " +escola.nome);
        System.out.println("Endereço: " +escola.endereco);
        System.out.println("CEP: " +escola.cep);

    }
}
