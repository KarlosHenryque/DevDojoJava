package academy.devdojo.maratonjava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes= new String[3];
        nomes[0] = "Lucas";
        nomes[1] = "Marcos";
        nomes[2] = "Rafael";

        for (String nome : nomes){
            System.out.println("Seu nome é: "+nome);
        }
        
    }
}
