package academy.devdojo.maratonjava.introducao;

public class aula06EstruturasDeRepedicao01 {
    public static void main(String[] args) {

//        While, Do While, for

        System.out.println("While");
        int count = 0;
        while (count <= 5){
            System.out.println(count);
            count++;
        }

        System.out.println("\nDoWhile");
        do {
            System.out.println(count);
            count++;
        } while (count <= 5);

        System.out.println("\nFor");
        for (int i=0; i <= 5; i++){
            System.out.println(i);
        }
    }
}
