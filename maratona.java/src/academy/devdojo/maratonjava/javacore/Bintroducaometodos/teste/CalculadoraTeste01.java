package academy.devdojo.maratonjava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonjava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(2, 2);
        System.out.println("\nFinalizando CalculadoraTeste01");
    }
}
