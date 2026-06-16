package academy.devdojo.maratonjava.introducao;

public class Aula08ArraysMuldimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[]{1,2};
        arrayInt[1] = new int[]{1,2,3};
        arrayInt[2] = new int[]{1,2,3,4,5,6};

//        Modelo normal
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.print(arrayInt[i][j]);
            }
            System.out.println("\n-----------");
        }

//        Foreach
//        for (int[] arrBase : arrayInt) {
//            for (int num : arrBase) {
//                System.out.println(num);
//            }
//            System.out.println();
//        }
    }
}
