package academy.devdojo.maratonjava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // + - / *
        int numero01 = 10;
        int numero02 = 20;

        double soma = (numero01 + numero02);
        double subtracao = (numero01 - numero02);
        double divisao = ((double) numero01 / numero02);
        double multiplicacao = (numero01 * numero02);

        System.out.println("Operadores Básicos");
        System.out.println("Soma: " +soma);
        System.out.println("Subtração: " +subtracao);
        System.out.println("Divisão: " +divisao);
        System.out.println("Multiplicação: " +multiplicacao);

        // %
        System.out.println("\nOperador de resto");
        int resto = 21 % 2;
        System.out.println("Resto: " +resto);

        //<, >, <=, >=, ==, !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorIgualQueVinte = 10 >= 20;
        boolean isDezMenorIgualQueVinte = 10 <= 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;

        System.out.println("\nOperador de comparação");
        System.out.println("Dez é maior que vinte ? " +isDezMaiorQueVinte);
        System.out.println("Dez é menor que vinte ? " +isDezMenorQueVinte);
        System.out.println("Dez é maior igual a vinte ? " +isDezMaiorIgualQueVinte);
        System.out.println("Dez é menor igual a vinte ? " +isDezMenorIgualQueVinte);
        System.out.println("Dez é igual a vinte ? " +isDezIgualAVinte);
        System.out.println("Dez é diferente de vinte ? " +isDezDiferenteDeVinte);
    }
}
