package academy.devdojo.maratonjava.exercicios.execicio01.teste;


import academy.devdojo.maratonjava.exercicios.execicio01.dominio.Desenvolvedor;
import academy.devdojo.maratonjava.exercicios.execicio01.dominio.Gerente;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Jorginho", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("MarkinhoJK", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
