package academy.devdojo.maratonjava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condição, mas vou ter!";

        // (condição) ? verdadeiro : falso
        String Resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(Resultado);
    }
}
