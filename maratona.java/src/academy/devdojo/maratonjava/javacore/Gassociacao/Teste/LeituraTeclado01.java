package academy.devdojo.maratonjava.javacore.Gassociacao.Teste;

import java.util.Scanner;

public class LeituraTeclado01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite M ou F para o seu sexo: ");
        char sexo = sc.next().charAt(0);

        System.out.println("Seu nome é: " +nome);
        System.out.println("Sua idade é: " +idade);

        if (sexo == 'M' || sexo == 'm'){
            System.out.println("Masculino");
        } else if (sexo == 'F' || sexo == 'f'){
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo invalido");
        }
    }
}
