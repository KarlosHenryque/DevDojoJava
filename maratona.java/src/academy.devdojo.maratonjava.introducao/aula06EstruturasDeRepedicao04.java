package academy.devdojo.maratonjava.introducao;

public class aula06EstruturasDeRepedicao04 {
    public static void main(String[] args) {
        double valorDoCarro = 2000000;
        double valorMinParcela = 1000;

        for(int parcela = 1; parcela <= valorDoCarro; parcela++) {
            double valorParcela = (valorDoCarro / parcela);
            if (valorParcela < valorMinParcela) {
                break;
            }
            System.out.println("Parcela "+parcela+" R$: "+valorParcela);
        }

    }
}
