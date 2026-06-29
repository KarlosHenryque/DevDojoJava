package academy.devdojo.maratonjava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println("Soma");
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println("\nSubtrai");
        System.out.println(10 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println("\nMultiplicar");
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void imprimeDivisaoDoisNumeros (double num1, double num2) {
        if (num2 == 0){
            System.out.println("Não existe divisão por zero");
        } else {
            System.out.println(num1/num2);
        }
    }

    public void alteraDoisNumeros(double num1, double num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num 1: " +num1);
        System.out.println("Num 2: " +num2);
    }

}
