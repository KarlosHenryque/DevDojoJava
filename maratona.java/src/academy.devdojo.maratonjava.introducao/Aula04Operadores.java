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

        // && (AND),  || (OR),  ! (NOT)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("Operador AND");
        System.out.println("\nDentro da lei maior que trinta ?" +isDentroDaLeiMaiorQueTrinta);
        System.out.println("Dentro da lei menor que trinta ?" +isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("Operador OR");
        System.out.println("\nViável comprar o playstation 5 ? "+isPlaystationCincoCompravel);

        // Operador de atribuição ( =, +=, -=, *=, /=, %=)

        double bonus = 1800;
        bonus += 1000;
        System.out.println("\nBonus: " +bonus);

        bonus -= 500;
        System.out.println("Bonus: " +bonus);

        bonus *= 500;
        System.out.println("Bonus: " +bonus);

        bonus /= 500;
        System.out.println("Bonus: " +bonus);

        bonus %= 500;
        System.out.println("Bonus: " +bonus);

        int contador = 0;
        contador++;
        System.out.println("\nContador: "+ contador);
        contador--;
        System.out.println("Contador: "+ contador);

    }
}
