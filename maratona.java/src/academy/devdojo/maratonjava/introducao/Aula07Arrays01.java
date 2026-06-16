package academy.devdojo.maratonjava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 20;
        idades[2] = 19;

//        for (int i = 0; i < idades.length; i++) {
//            System.out.println("Idade: " +idades);
//        }

        for (int idade : idades){
            System.out.println("Idade: " +idade);
        }
    }
}
