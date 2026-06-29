package academy.devdojo.maratonjava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonjava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);

        System.out.println(calculadora.divideDoisNumeros(10, 3));

        calculadora.imprimeDivisaoDoisNumeros(10, 0);
    }
}
