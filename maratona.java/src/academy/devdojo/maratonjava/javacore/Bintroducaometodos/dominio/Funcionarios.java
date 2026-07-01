package academy.devdojo.maratonjava.javacore.Bintroducaometodos.dominio;

public class Funcionarios {
    public String nome = null;
    public int idade = 0;
    public double[] salarios = null;

//    Minha resolução
//    public void imprimir(){
//        System.out.println("Dados do funcionário:\n");
//        System.out.println("nome: " +this.nome);
//        System.out.println("idade: " +this.idade);
//
//        System.out.println("Salários:");
//        for (int i = 0; i < salarios.length ; i++) {
//            System.out.println("Salário "+(i + 1)+": R$" +this.salarios[i]);
//        }
//
//        mediaSalarial();
//    }
//
//    public void mediaSalarial() {
//        double soma = 0;
//
//        for (int i = 0; i < salarios.length ; i++) {
//            soma += this.salarios[i];
//        }
//
//        double media = soma / salarios.length;
//        System.out.println("\nMédia salárial do funcionário "+this.nome+" é de R$: "+media);
//    }

////  Resolução do curso
    public void imprimir(){
        System.out.println("Dados do funcionário:\n");
        System.out.println("nome: " +this.nome);
        System.out.println("idade: " +this.idade);

        if (salarios != null) {
            for (double salario : salarios) {
                System.out.println("Salários: " + salario + " ");
            }
        }

        mediaSalarial();
    }

    public void mediaSalarial() {
        double media = 0;
            if (salarios != null) {
                for (double salario : salarios) {
                    media += salario;
                }
                media /= salarios.length;
            }

        System.out.println("\nMédia salárial do funcionário "+this.nome+" é de R$: "+media);
    }

}
