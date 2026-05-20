package academy.devdojo.maratonjava.introducao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        // Declaração de variáveis
        String nome = "Karlos";
        String endereco = "Av Brasil, N° 2553";
        double salario = 2500.12;
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataRecebimentoSalario = LocalDate.of(2026, 5, 19);
        String dataFormatada = dataRecebimentoSalario.format(formatterDate);

        // Criando Frase
        String frase = "Eu " + nome + ", morando no endereço " + endereco +" confirmo que recebi o salário de R$: " + salario + ", na data de " +dataFormatada;

        System.out.println(frase);
    }
}
