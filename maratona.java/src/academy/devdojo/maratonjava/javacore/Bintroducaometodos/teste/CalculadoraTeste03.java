package academy.devdojo.maratonjava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonjava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double num1 = 1;
        double num2 = 2;

        calculadora.alteraDoisNumeros(num1, num2);

        System.out.println("\nDentro da class calculadoraTest03");
        System.out.println(num1);
        System.out.println(num2);
    }
}
