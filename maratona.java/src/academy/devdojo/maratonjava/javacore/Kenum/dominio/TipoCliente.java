package academy.devdojo.maratonjava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    public String NOMERELATORIO;

    TipoCliente(int valor, String nomeRelatorio){
        this.VALOR = valor;
        this.NOMERELATORIO = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for(TipoCliente tipoCliente : values()){
            if(tipoCliente.getNOMERELATORIO().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNOMERELATORIO() {
        return NOMERELATORIO;
    }

    public int getVALOR() {
        return VALOR;
    }
}
