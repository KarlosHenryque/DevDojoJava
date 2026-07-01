package academy.devdojo.maratonjava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonjava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArray(1,2,3,4,5,6,7);
    }
}
