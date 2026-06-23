package academy.devdojo.maratonjava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonjava.javacore.Aintroducaoclasses.dominio.Carro;

public class Carro01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Peugeot";
        carro01.modelo = "206";
        carro01.ano = 2008;

        carro02.nome = "Sandeiro";
        carro02.modelo = "Gtline";
        carro02.ano = 2014;

        System.out.println("Carro 01");
        System.out.println("Nome: " +carro01.nome+ ", modelo: "+carro01.modelo+" e ano: "+carro01.ano);
        System.out.println("\nCarro 02");
        System.out.println("Nome: " +carro02.nome+ ", modelo: "+carro02.modelo+" e ano: "+carro02.ano);
    }
}
