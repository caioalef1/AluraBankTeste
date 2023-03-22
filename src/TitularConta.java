public class TitularConta {

    private String nomeTitular;
    private String cpf;

    public TitularConta(String nomeTitular, String cpf) {
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
