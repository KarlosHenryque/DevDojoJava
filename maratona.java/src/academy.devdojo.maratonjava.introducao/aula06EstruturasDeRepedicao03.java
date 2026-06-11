package academy.devdojo.maratonjava.introducao;

public class aula06EstruturasDeRepedicao03 {
    public static void main(String[] args) {
        int valorMax = 50;
        int valorMin = 25;

        for (int i = 0; i <= valorMax; i++) {
            if (i > valorMin) {
                break;
            }
            System.out.println(i);
        }
    }
}
