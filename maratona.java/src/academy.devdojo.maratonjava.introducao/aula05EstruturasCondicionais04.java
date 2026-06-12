package academy.devdojo.maratonjava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 70000.00;
        double porcentagemDesconto = 0.00;

        if (salario > 0 && salario <= 34712.00) {
           porcentagemDesconto = 9.70;
        } else if (salario > 34712.00 && salario <= 68507.00) {
            porcentagemDesconto = 37.35;
        } else {
            porcentagemDesconto = 49.50;
        }

        double valorDesconto = salario * (porcentagemDesconto / 100);
        double salarioFinal = salario - valorDesconto;

        System.out.printf("Salário bruto: R$ %.2f%n", salario);
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioFinal);
    }
}
